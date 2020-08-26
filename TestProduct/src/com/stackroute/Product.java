package com.stackroute;

import java.util.Scanner;

public class Product {                                     //This is a class to dispaly product details
    private String productCode;
    private String productName;
    private double productPrice;

    public  void getDetails() {           //This is a parameterized constructor
        productCode = "P101";
        productName = "Laptop";
        productPrice = 45000.00;
    }

    public void Display() {                                          //This is a method used to display product details
        System.out.println("Product code is " + productCode);
        System.out.println("Product name is " + productName);
        System.out.println("Product price is " + productPrice);
    }
}
