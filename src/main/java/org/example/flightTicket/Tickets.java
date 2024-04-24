package org.example.flightTicket;

import java.util.Objects;

public class Tickets {

    public String pnrNumber;


    @Override
    public boolean equals(Object obj){
        if(this==obj){
            return  true;

        }if(this.getClass()!=obj.getClass()){
            return false;
        }
        Tickets flighttickets = (Tickets) obj;
        return this.pnrNumber.equals(flighttickets.pnrNumber);
    }

    @Override
    public int hashCode() {

        return Objects.hash(pnrNumber);
    }

    @Override
    public String toString() {
        return "Tickets{" +
                "pnrNumber='" + pnrNumber + '\'' +
                '}';
    }
}
