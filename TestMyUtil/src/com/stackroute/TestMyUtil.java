package com.stackroute;

import java.util.Scanner;

public class TestMyUtil {

    public static void main(String[] args) {
        MyUtil obj = new MyUtil();

        Scanner s = new Scanner(System.in);
        System.out.println("Enter array size");

        int size = s.nextInt();
        int array[] = new int[size];
        int sum=0;
        System.out.println("Enter array elements");
        for(int i=0;i<size;i++) {
            array[i] = s.nextInt();
        }
        System.out.println(obj.findAverage(array));
    }
}
