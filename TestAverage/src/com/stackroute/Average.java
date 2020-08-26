package com.stackroute;

public class Average {
    double average;
    public  double doAverage(int number1,int number2)
    {
        average = (number1 + number2)/2.0;
        return average;
    }
    public double doAverage(int number1,int number2,int number3)
    {
        average = (number1 + number2 + number3)/3.0;

        return average;
    }
    public double doAverage(double number1,double number2)
    {
        average = (number1 + number2)/2.0;
        return average;
    }
}
