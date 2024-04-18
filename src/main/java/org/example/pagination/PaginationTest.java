package org.example.pagination;

import java.util.List;

public class PaginationTest {
    public static void main(String[] args) {
        DataService dataService=new DataService();
        List<String> names=dataService.getName();

            Pagination pagination=new Pagination();
            pagination.perPageRecordsSize=10;
        System.out.println(names.size()%10);
        if(names.size()%10>0){
            pagination.totalPages=names.size()/10+1;

        }else {
            pagination.totalPages=names.size()/10;
        }
        for(int i=0;i<pagination.totalPages;i++){
            int endIndex=(i*pagination.perPageRecordsSize)+pagination.perPageRecordsSize;
            if(endIndex>names.size()   ){
                endIndex=names.size();
            }
            List<String>stringList=names.subList(i* pagination.perPageRecordsSize,endIndex);
            System.out.println("page value "+i+" values "+stringList);

        }


    }
}
