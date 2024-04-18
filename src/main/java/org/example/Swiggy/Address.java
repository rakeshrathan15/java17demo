package org.example.Swiggy;

public class Address {
    public String area;
    public String flatNo;

    public String state;
    public String city;

    public String pincode;

    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        }
        if(this.getClass()!=obj.getClass()){
            return false;
        }
        Address address=(Address) obj;
        return this.area.equals(address.area)&&
                this.city.equals(address.city)&&
                this.state.equals(address.state);
    }
    public int hashCode(){
        return this.area.hashCode()+
                this.state.hashCode()+
                this.city.hashCode()+
                this.flatNo.hashCode();
    }

    @Override
    public String toString() {
        return "Address{" +
                "area='" + area + '\'' +
                ", flatNo='" + flatNo + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }
}
