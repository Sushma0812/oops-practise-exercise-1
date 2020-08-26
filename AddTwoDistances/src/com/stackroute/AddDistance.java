package com.stackroute;
import java.util.Scanner;
class AddDistance{                                               //This class is created to implement methods
    int feet;
    int inches;
    public void getDistance()                                    //This method is used to read inputs
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter feet");
        feet = reader.nextInt();
        System.out.println("Enter inches");
        inches = reader.nextInt();
    }
    public void addDistance(AddDistance obj1, AddDistance obj2)       //This method is used to calculate two distances
    {
        inches = obj1.inches + obj2.inches;
        feet = obj1.feet + obj2.feet;
        inches = inches %12;
    }
    public void showDistance()                                     //This method is used to dispaly the total distance
    {
        System.out.println("Feet: "+feet +"  "+" Inches: " +inches);
    }
}


