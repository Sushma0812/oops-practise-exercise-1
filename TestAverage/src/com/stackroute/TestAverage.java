package com.stackroute;
import java.util.Scanner;
/*
 *This class contain a method to find the average of given numbers
 */
public class TestAverage {

    public static void main(String[] args) {
        Average average = new Average();
        double numberOne,numberTwo,numberThree;
        Scanner reader =new Scanner(System.in);
        numberOne = reader.nextDouble();
        numberTwo = reader.nextDouble();
        numberThree= reader.nextDouble();
        System.out.println(average.doAverage(numberOne,numberTwo));
        System.out.println(average.doAverage(numberOne,numberTwo,numberThree));
        System.out.println(average.doAverage(numberOne,numberTwo));
    }
}


