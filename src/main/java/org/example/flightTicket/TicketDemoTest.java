package org.example.flightTicket;



import java.util.*;

public class TicketDemoTest {

    public static void main(String[] args) {
       Map<Integer, Tickets> ticketMap = new HashMap<>();
        List<Tickets> ticketList=new ArrayList<>();

        for (int i=0;i<10000000;i++){
            Tickets tickets1 =  new Tickets();
            tickets1.pnrNumber="123"+i;

         //   Tickets tickets2 =  new Tickets();
         //   tickets2.pnrNumber="123"+i+1;

            ticketList.add(tickets1);
            ticketMap.put(tickets1.hashCode(),tickets1);
         //   System.out.println(ticketMap);
         //   System.out.println(ticketList);
         //   System.out.println(tickets1);

        }

      //  ticketMap.forEach(k,v) ->


       ticketMap.forEach((integer, tickets) -> {
           System.out.println("key from for each " + integer + " value " + tickets);

       });
//
        Tickets findTicket= new Tickets();
        findTicket.pnrNumber="123500000";

        System.out.println("getting ticket from ticket list");

        long liststartTime=System.currentTimeMillis();


        Iterator<Tickets> ticketsIterator =ticketList.iterator();
        for (;ticketsIterator.hasNext();){
            Tickets tickets = ticketsIterator.next();
            if(tickets.equals(findTicket)){
                System.out.println(" Find the ticket "+tickets.pnrNumber);
                break;
            }
        }
        long listEndTime =System.currentTimeMillis();
       System.out.println(("Time taken from list "+(listEndTime-liststartTime)));

        System.out.println("Getting tickets from Map");
       long mapStartTime= System.currentTimeMillis();
       Tickets mapTickets= ticketMap.get(findTicket.hashCode());

        System.out.println("find the ticket from map"+mapTickets.pnrNumber);
        long mapEndTime =System.currentTimeMillis();
        System.out.println("Time taken map "+(mapEndTime-mapStartTime));




    }
}
