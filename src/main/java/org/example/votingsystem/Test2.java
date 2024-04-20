package org.example.votingsystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        Vote voter1 = new Vote();
        voter1.name = "Siva";
        voter1.aadharNo = "1111";
        voter1.status = "Yes";

        Vote voter2 = new Vote();
        voter2.name = "Siva krishna";
        voter2.aadharNo = "1122";
        voter2.status = "No";

        Vote voter3 = new Vote();
        voter3.name = "Hari";
        voter3.aadharNo = "2222";
        voter3.status = "Yes";

        Vote voter4 = new Vote();
        voter4.name = "Krishna";
        voter4.aadharNo = "3333";
        voter4.status = "Yes";

        Vote voter5 = new Vote();
        voter5.name = "Ram";
        voter5.aadharNo = "4444";
        voter5.status = "No";

        List<Vote> voterList = new ArrayList<>();
        voterList.add(voter1);
        voterList.add(voter2);
        voterList.add(voter3);
        voterList.add(voter4);
        voterList.add(voter5);
        voterList.add(voter1);
        voterList.add(voter4);
        voterList.add(voter3);

        System.out.println("Voter Status:");

        List<String> uniqueAadharNumbers = new ArrayList<>();
        for (Iterator<Vote> iterator = voterList.iterator(); iterator.hasNext();) {
            Vote voter = iterator.next();
            if (!uniqueAadharNumbers.contains(voter.aadharNo)) {
                uniqueAadharNumbers.add(voter.aadharNo);
                if (voter.status.equals("Yes")) {
                    System.out.println(voter.name + " has casted their vote.");
                } else {
                    System.out.println(voter.name + " has not casted their vote.");
                }
            }
        }

        System.out.println("Duplicates found:");

        List<String> seenAadharNumbers = new ArrayList<>();
        for (Iterator<Vote> iterator = voterList.iterator(); iterator.hasNext();) {
            Vote voter = iterator.next();
            if (!seenAadharNumbers.contains(voter.aadharNo)) {
                seenAadharNumbers.add(voter.aadharNo);
            } else {
                System.out.println("Person with Aadhar No " + voter.aadharNo + " is a duplicate.");
            }
        }
    }
}
