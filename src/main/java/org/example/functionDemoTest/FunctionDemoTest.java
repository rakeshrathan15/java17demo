package org.example.functionDemoTest;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionDemoTest {

    Function<String,String > toupperFunc = (fullName)->
    {
       return fullName.toUpperCase();
    };
    BiFunction<String,String,String> concatFunction=(firstName,lastName)->{
      String fullName= firstName+lastName;
        System.out.println("Name "+fullName);
        return firstName;
    };

    BiFunction<String,String ,Integer> countFunc=(firstName,lastName)->{
        String fullName = firstName+lastName;
        int firstNamelength=firstName.length();
        int lastNamelength=lastName.length();
        System.out.println("Name "+fullName);
        return firstNamelength;
    };

    public String concatName(String firstName,String lastName){
        String fullName=firstName+lastName;
        System.out.println("Name "+fullName);
        return fullName;
    }

    public static void main(String[] args) {
        FunctionDemoTest demoTest= new FunctionDemoTest();
        demoTest.concatName("NEOTERIC","METHOD");

        demoTest.countFunc.apply("Neoteric","Method");

        int length = demoTest.countFunc.apply("Neoteric","method");
        System.out.println("Length "+length);
        String outputName = demoTest.toupperFunc.apply("Neotric");
        System.out.println("outputName "+outputName);
    }
}
