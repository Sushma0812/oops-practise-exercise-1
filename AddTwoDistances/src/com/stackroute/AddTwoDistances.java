package com.stackroute;

public class AddTwoDistances {                          //This class contain method used to add two distances

    public static void main(String[] args) {
        AddDistance addDistanceOne = new AddDistance();
        AddDistance addDistanceTwo = new AddDistance();
        AddDistance addDistanceThree = new AddDistance();
        addDistanceOne.getDistance();                             //object is created to read values
        addDistanceTwo.getDistance();                             //object is created to read values
        addDistanceThree.addDistance(addDistanceOne, addDistanceTwo);                    //object is created to add distances
        System.out.println("Total Distance is");
        addDistanceThree.showDistance();                            //object is created to display total distance


    }
}

