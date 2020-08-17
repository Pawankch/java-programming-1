package pk;

import java.util.*;
public class Circle{
    private double radius;
    private String color;
    Circle(){
        radius=1.0;
        color="red";
    }

    Circle(double r){
        radius=r;
    }

    double getRadius(){
        return radius;
    }

    double getArea(){
        return (22*radius*radius)/7 ;
    }

    public static void main(String[] args) {
        Circle c1=new Circle();
        System.out.println("Radius: "+ c1.getRadius());
        System.out.println("Area: "+ c1.getArea());

        Circle c2=new Circle(2.5);
        System.out.println("Radius: "+ c2.getRadius());
        System.out.println("Area: "+ c2.getArea());
    }
}