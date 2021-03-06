package com.stackroute;
/*
 *This class contains subclasses
 */
public class Shape {
    void draw() {
        System.out.println("Shape draw");
    }

    void erase() {
        System.out.println("Shape erase");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Circle draw");
    }

    void erase() {
        System.out.println("Circle erase");
    }
}

class Triangle extends Shape {
    void draw() {
        System.out.println("Triangle draw");
    }

    void erase() {
        System.out.println("Triangle erase");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Square draw");
    }

    void erase() {
        System.out.println("Square erase");
    }
}

