package org.example.votingsystem;

import org.example.streamdemo.Ticket;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class VoteDemoTest {

    public void vote(List<Vote> voteList, Predicate<Vote> predicate,  Predicate<Vote> predicate1 ){

     //   boolean hasAlreadyVoted = false;
        Iterator<Vote> iterator= voteList.iterator();
        for (;iterator.hasNext() ;){
          Vote vote=  iterator.next();
            if(predicate.test(vote)){
                vote.status="Already-voted";

                System.out.println("Vote recorded successfully for Aadhar Card: "+ vote.aadharNo);

            }
            if (predicate1.test(vote)) {


                System.out.println("You have already voted. Voting is not allowed more than once. Your adhar number is "+vote.aadharNo);
            }
        }
    }


    public static void main(String[] args) {
        Vote vote1=new Vote();
        vote1.aadharNo="111";
        vote1.status="not-voted";

        Vote vote2=new Vote();
        vote2.aadharNo="222";
        vote2.status="not-voted";

        Vote vote3=new Vote();
        vote3.aadharNo="333";
        vote3.status="Already-voted";


        List<Vote> voterList = new ArrayList<>();
        voterList.add(vote1);
        voterList.add(vote2);
       voterList.add(vote3);
        voterList.add(vote2);
       // voterList.add(vote3);

        Predicate<Vote> votePredicate=(vote ) ->
                vote.status.equals("not-voted");
        Predicate<Vote> alreadyVotedPredicate=(vote)->
                vote.status.equals("Already-voted");

        VoteDemoTest voteDemoTest=new VoteDemoTest();
        voteDemoTest.vote(voterList,votePredicate,alreadyVotedPredicate);
       // voteDemoTest.vote(voterList,alreadyVotedPredicate);



    }
}
