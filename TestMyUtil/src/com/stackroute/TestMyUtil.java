package com.stackroute;
import java.util.Scanner;
/*
 *This class contain a method to find average of array elements
 */
public class TestMyUtil {

    public static void main(String[] args) {
        MyUtil myUtil = new MyUtil();

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter array size");

        int size = reader.nextInt();
        int array[] = new int[size];
        int sum=0;
        System.out.println("Enter array elements");
        for(int i=0;i<size;i++) {
            array[i] = reader.nextInt();
        }
        System.out.println(myUtil.findAverage(array));
    }
}
