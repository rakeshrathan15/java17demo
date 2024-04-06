package org.example.Ajio;

import java.util.ArrayList;
import java.util.List;

public class ShopDemoTest {
    public static void main(String[] args) {
        Product shirtProduct=new Product();
        ProductSpecification productSpecification = new ProductSpecification();
        productSpecification.size=32;
        productSpecification.color="red";
        productSpecification.price=2500;

        shirtProduct.type="shirt";
        shirtProduct.productSpecification=productSpecification;

     //   System.out.println(" Type:  " + shirtProduct.type);
     //   System.out.println("shirt specification:  " + shirtProduct.productSpecification);


        Product tshirtProduct = new Product();
        ProductSpecification tshirtproductspecification= new ProductSpecification();
        tshirtproductspecification.size=34;
        tshirtproductspecification.color="white";
        tshirtproductspecification.price=1000;

        tshirtProduct.type="T-Shirt";
        tshirtProduct.productSpecification=tshirtproductspecification;

      //  System.out.println("Type:  " + tshirtProduct.type);
     //   System.out.println("T-shirt specification:  " + tshirtProduct.productSpecification);

        Shop shop=new Shop();
        List<Product>productList=new ArrayList<>();
      //  productList.add(shirtProduct);
        productList.add(tshirtProduct);

        shop.productList=productList;

        shop.availablity(shirtProduct);
        shop.availablity(tshirtProduct);

        productList.stream().forEach(product -> {
            System.out.println("Stream"+product);

        });


    }
}
