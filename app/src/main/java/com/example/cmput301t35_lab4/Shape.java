package com.example.cmput301t35_lab4;

// create an abstract class called Shape with x and y integer fields
public abstract class Shape {
    private int x;
    private int y;
    private String color = "$PUT_YOUR_CHOICE_OF_COLOR";


    String color = " blue";

=======
    //String color = "black";

    // create a constructor for Shape
    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // create a getter for x
    public int getX() {
        return x;
    }

    // create a getter for y
    public int getY() {
        return y;
    }

    // create an abstract method called area
    public abstract double area();
}
