package com.stackroute;
/*
 *This class contains overloading methods to calculate average of the given numbers
 */
public class Average {
    double average;

    public double doAverage(int numberOne, int numberTwo) {
        average = (numberOne + numberTwo) / 2.0;
        return average;
    }

    public double doAverage(int numberOne, int numberTwo, int numberThree) {
        average = (numberOne + numberTwo + numberThree) / 3.0;

        return average;
    }

    public double doAverage(double numberOne, double numberTwo) {
        average = (numberOne + numberTwo) / 2.0;
        return average;
    }
}
