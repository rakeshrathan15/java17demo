package org.example.Ajio;

import java.util.List;

public class Shop {


    public List<Product> productList;

public void availablity(Product product){
    if(productList.contains(product)){
        System.out.println("Product is available"+ product);

    }else {
        System.out.println("not availble" );
    }

}


}
