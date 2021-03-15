package org.prvn.app.model;

import lombok.Data;

/*
 Open Close Principle
    Can achieve two ways
        1) Inheritance (extends) : introduces tight coupling With Base class
            Polymorphic one --> Use interfaces and implementation classes
        2) Method Delegation

 */

@Data
class Rectangle {
    private double height;
    private double width;
}

// New requirement to calculate the Circle area
@Data
class Circle {
    private double radius;
}


//calculates the Area of shape
public class Area {

// calculates the Area of Rectangle
//New requirement to calculate the Circle area
    // in future there is requirement that comes for calculate are of square....
    // again change the code..
    //Not following the Closed for modification principle here
    public double calculateArea(Object[] shapes){
        double area =0;

        for (Object shape : shapes) {
            if(shape instanceof  Rectangle){
                Rectangle rectangle  = (Rectangle) shape;
                area+= rectangle.getHeight()* rectangle.getWidth();
            }else{
                Circle circle = (Circle) shape;
                area+= circle.getRadius()*circle.getRadius()*Math.PI;
            }
        }
        return area;
    }

}

//Solution:  follow Open/closed principle

interface AreaCalculator{
    double calculateArea(Object[] shapes);
}

//implement  Rectangle Area calculator

class RectangleAreaCalculator implements AreaCalculator{

    @Override
    public double calculateArea(Object[] shapes) {
        double area = 0;
        for (Object shape : shapes) {
            Rectangle rectangle = (Rectangle) shape;
            area += rectangle.getHeight() * rectangle.getWidth();
        }
        return  area;
    }
}


//implement  Rectangle Area calculator

class CircleAreaCalculator implements AreaCalculator{

    @Override
    public double calculateArea(Object[] shapes) {
        double area = 0;
        for (Object shape : shapes) {
                Circle circle = (Circle) shape;
                area+= circle.getRadius()*circle.getRadius()*Math.PI;
            }
        return  area;
        }
}