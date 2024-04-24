package org.example.functionDemoTest;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class BiSupplierDemoTest {
    Supplier<List<Restaurent>> restaurentList=()->{
      List<Restaurent> restaurentList1=new ArrayList<>();
      Restaurent restaurent=new Restaurent();
      restaurent.name="Balaji Grand";
      restaurentList1.add(restaurent);
      Restaurent restaurent1=new Restaurent();
      restaurent1.name="KFC";
      restaurentList1.add(restaurent1);
      return restaurentList1;
    };

    public List<Restaurent> getRestaurentList(){
        List<Restaurent> restaurentList1=new ArrayList<>();
        Restaurent restaurent=new Restaurent();
        restaurent.name="Balaji Grand";
        restaurentList1.add(restaurent);
        Restaurent restaurent1=new Restaurent();
        restaurent1.name="KFC";
        restaurentList1.add(restaurent1);
        return restaurentList1;
    }


    Consumer<List<Restaurent>> restaurnetConsumer = (abc) ->{
        abc.stream().forEach(test ->{
            System.out.println("Consumer "+test.name);
        });
    };

    public static void main(String[] args) {
        BiSupplierDemoTest test =new BiSupplierDemoTest();
        List<Restaurent> funList = test.restaurentList.get();
        List<Restaurent> methodList = test.getRestaurentList();
        System.out.println("funcList "+ funList);
        System.out.println("MethodList "+methodList);
        test.restaurnetConsumer.accept(funList);

    }
}
