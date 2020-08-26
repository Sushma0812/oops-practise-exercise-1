package com.stackroute;

import java.util.Scanner;

public class MyUtil {
    public static void throwDice()
    {
        int die = (int)(Math.random()*6)+1;
        System.out.println("Number thrown on die is "+die);
    }
    public static float findAverage(int[] array)
    {
        Scanner s = new Scanner(System.in);
        int sum=0;
        for(int i=0;i<array.length;i++){
            array[i]=s.nextInt();
            sum=sum+array[i];
        }
        int average =sum/array.length;
        return average;

    }

}
