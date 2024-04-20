package org.example.votingsystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;


public class Test {
    public void vote(List<Vote> voterList, Predicate<Vote> predicate) {


        boolean hasAlreadyVoted = false;
        Iterator<Vote> iterator = voterList.iterator();
        for (; iterator.hasNext(); ) {

            Vote vote = iterator.next();
            if (predicate.test(vote)) {
                hasAlreadyVoted = true;
                System.out.println(vote.status);
            }
        }

        if (hasAlreadyVoted) {
            System.out.println("You have already voted. Voting is not allowed more than once.");
        } else {
            // Omitting the addition of a new vote to the voterList
            System.out.println("Vote recorded successfully for Aadhar Card: "  );
        }
    }

    public static void main(String[] args) {

        Predicate<Vote> votePredicate = (vote ) ->
                vote.status.equals("yes");

        Predicate<Vote> alreadyVotedPredicate = (vote ) ->
                vote.status.equals("no");
        Vote vote1=new Vote();
        vote1.aadharNo="111";
        vote1.status="yes";

        Vote vote2=new Vote();
        vote2.aadharNo="222";
        vote2.status="yes";


        List<Vote> voterList = new ArrayList<>();
        voterList.add(vote1);
        voterList.add(vote2);
        voterList.add(vote2);

        Test test=new Test();
        test.vote(voterList,votePredicate);
        test.vote(voterList,alreadyVotedPredicate);
    }
    }

