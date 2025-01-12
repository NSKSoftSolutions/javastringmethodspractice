package org.example.constructorsexamples;

public class Product {

    int pId;
    String name;
    int quantity;

    public Product() {

        pId = 1;
        name = "JBL Bluttoth Speaker";
        quantity = 1;

        System.out.println("Product Id is -->" + pId);
        System.out.println("Product Name -->" + name);
        System.out.println("quantity --> " + quantity);
    }


}
