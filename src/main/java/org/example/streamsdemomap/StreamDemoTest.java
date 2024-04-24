package org.example.streamsdemomap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingDouble;


public class StreamDemoTest {
    public static void main(String[] args) {

        AccountService accountService=new AccountService();

        Map<Account,Account> accountMap=accountService.getAccount();

        Account account=new Account();
        account.accountNumber="111111";

        Account fullAccount = accountMap.get(account);
        System.out.println(fullAccount.accountNumber);

        Predicate<AccountDetails> creditTypePredicate = (accountDetails ) ->
                accountDetails.type.equals("Credit");

        List<AccountDetails> creditAccountDetails = fullAccount.accountDetailsList.stream().
                filter(accountDetails -> creditTypePredicate.test(accountDetails)).
                collect(Collectors.toList());

//        List<AccountDetails> creditAccountDetails = fullAccount.accountDetailsList.stream().
//                filter(abc -> creditTypePredicate.test(abc)).collect(Collectors.toList());


        System.out.println("Stream credit Account details "+creditAccountDetails);

        List<AccountDetails> normalDorCreditAccountDetails = new ArrayList<>();
        for (int i=0;i<fullAccount.accountDetailsList.size();i++){
            if(fullAccount.accountDetailsList.get(i).type.equals("Credit")){
                normalDorCreditAccountDetails.add(fullAccount.accountDetailsList.get(i));
            }
        }

        System.out.println("noramal for loop"+normalDorCreditAccountDetails);


        System.out.println("------------------");
        System.out.println("from Map");
        Map<String, Double> groupBytypeSum =   fullAccount.accountDetailsList.stream().
                collect(groupingBy(AccountDetails::getType,summingDouble(AccountDetails::getAmount)));

        System.out.println(groupBytypeSum);

        System.out.println("---------------------------------------------");
        System.out.println("from loop");

        Map<String,Double> groupBynormalMap= new HashMap<String,Double>();
        double creditSum =0;
        double debitSum=0;

        for (int i=0;i<fullAccount.accountDetailsList.size();i++){
            if(fullAccount.accountDetailsList.get(i).type.equals("Credit")){
                AccountDetails details = fullAccount.accountDetailsList.get(i);
                creditSum=creditSum+details.getAmount();

            } else if(fullAccount.accountDetailsList.get(i).type.equals("Debit")){
                AccountDetails details=fullAccount.accountDetailsList.get(i);
                debitSum=debitSum+details.getAmount();
            }

            }
        System.out.println("Sum values = "+creditSum + " debit = "+ debitSum);

        }


    }

