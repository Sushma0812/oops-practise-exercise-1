package com.stackroute;
import java.util.Scanner;
public class TestAverage {

    public static void main(String[] args) {
        Average obj1 = new Average();
        double number1,number2,number3;
        Scanner reader =new Scanner(System.in);
        number1 = reader.nextDouble();
        number2 = reader.nextDouble();
        number3= reader.nextDouble();
        System.out.println(obj1.doAverage(number1,number2));
        System.out.println(obj1.doAverage(number1,number2,number3));
        System.out.println(obj1.doAverage(number1,number2));
    }
}
