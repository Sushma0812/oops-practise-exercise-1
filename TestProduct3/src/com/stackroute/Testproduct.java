package com.stackroute;
/*
 *This is a class used to call a constructor
 */
class TestProduct {
    public static void main(String[] args) {
        Product product = new Product("P101", "Laptop", 45000.00);
        product.Display();
    }
}
