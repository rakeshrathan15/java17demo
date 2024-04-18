package org.example.pagination;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class DataService {
    public List<String> getName(){
     List<String> list=new ArrayList<>();
     for (int i =1;i<105;i++){
         list.add(String.valueOf(i));
     }

        return  list ;
    }

}
