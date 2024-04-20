package org.example.streamdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class PredicateAsParameter {

    public void ticketStatus(List<Ticket> ticketList, Predicate<Ticket> predicate){
        Iterator<Ticket> iterator= ticketList.iterator();
        for (; iterator.hasNext();){
           Ticket ticket= iterator.next();
           if(predicate.test(ticket)){
               System.out.println("Ticket status "+ticket.status);
           }

        }
    }


    public static void main(String[] args) {

        Predicate<Ticket> sucessPredicate=(ticket )->
                ticket.status.equals("Sucess");
        Predicate<Ticket> failPredicate=(ticket )->
                ticket.status.equals("Fail");
        Predicate<Ticket> blockPredicate=(ticket )->
                ticket.status.equals("Blocked");

        Ticket ticket1 = new Ticket();
        ticket1.ticketId="1";
        ticket1.status="Sucess";

        Ticket ticket2=new Ticket();
        ticket2.ticketId="2";
        ticket2.status="Sucess";

        Ticket ticket3=new Ticket();
        ticket3.ticketId="3";
        ticket3.status="Fail";

        Ticket ticket4=new Ticket();
        ticket4.ticketId="4";
        ticket4.status="Fail";

        Ticket ticket5=new Ticket();
        ticket5.ticketId="5";
        ticket5.status="Blocked";

        List<Ticket> ticketList= new ArrayList<>();
        ticketList.add(ticket1);
        ticketList.add(ticket2);
        ticketList.add(ticket3);
        ticketList.add(ticket4);
        ticketList.add(ticket5);

        PredicateAsParameter predicateAsParameter=new PredicateAsParameter();
        predicateAsParameter.ticketStatus(ticketList,sucessPredicate);
        predicateAsParameter.ticketStatus(ticketList,failPredicate);
        predicateAsParameter.ticketStatus(ticketList,blockPredicate);


    }
}
