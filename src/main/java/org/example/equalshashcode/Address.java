package org.example.equalshashcode;

import java.util.Objects;

public class Address {

    public String area;
    public String flatNo;
    public String pinCode;
    public String state;
    public String street;


@Override
    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        if ((this.getClass()!=obj.getClass())){
            return false;
        }

        Address otherAddress= (Address)  obj;
        return this.area.equals(otherAddress.area) && this.flatNo.equals(otherAddress.flatNo) &&
                this.state.equals(otherAddress.state) && this.pinCode.equals(otherAddress.pinCode)
                && this.street.equals(otherAddress.street);

    }

    @Override
    public int hashCode() {
        return Objects.hash(area, flatNo,  state, street);
    }

    @Override
    public String toString() {
        return "Address{" +
                "area='" + area + '\'' +
                ", flatNo='" + flatNo + '\'' +
                ", pinCode='" + pinCode + '\'' +
                ", state='" + state + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
