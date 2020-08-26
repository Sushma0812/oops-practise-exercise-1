package com.stackroute;
import java.util.Scanner;
public class AddTwoDistances {                          //This class is used to add two distances

    public static void main(String[] args) {
        AddDistance obj1 = new AddDistance();
        AddDistance obj2 = new AddDistance();
        AddDistance obj3= new AddDistance();
        obj1.getDistance();                             //object is created to read values
        obj2.getDistance();                             //object is created to read values
        obj3.addDistance(obj1,obj2);                    //object is created to add distances
        System.out.println("Total Distance is");
        obj3.showDistance();                            //object is created to display total distance



    }
}
