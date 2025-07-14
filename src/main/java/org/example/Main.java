package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("=== Area Calculator ===");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Rectangle");
        System.out.println("Choose a shape (1-3):");
        int shape = s.nextInt();
        double area=0;
        switch (shape){
            case 1:
                System.out.println("Enter the radius: ");
                double r=s.nextDouble();
                area=calculateCircleArea(r);
                System.out.printf("Area of the circle: %.2f%n",area);
                break;
            case 2:
                System.out.println("Enter the base: ");
                double b=s.nextDouble();
                System.out.println("Enter the height: ");
                double h=s.nextDouble();
                area=calculateTriangleArea(b,h);
                System.out.printf("Area of the triangle: %.2f%n",area);
                break;
            case 3:
                System.out.println("Enter the length: ");
                double l=s.nextDouble();
                System.out.println("Enter the width: ");
                double w=s.nextDouble();
                area=calculateRectangleArea(l,w);
                System.out.printf("Area of the rectangle: %.2f%n",area);
                break;
            default:
                System.out.println("Invalid option");
                System.exit(0);
        }


    }
    public static double calculateCircleArea(double r){
        double area= Math.PI*(r*r);
        return area;
    }
    public static double calculateTriangleArea(double b, double h){
        double area= (b*h)/2;
        return area;
    }
    public static double calculateRectangleArea(double l,double w){
        double area= w*l;
        return area;
    }
}
