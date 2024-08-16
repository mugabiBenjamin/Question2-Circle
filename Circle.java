/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.circle;

/**
 *
 * @author Benjn
 */
import java.util.Scanner;

class Circle {
    private static final double PI = Math.PI;
    private final double radius;

    public Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be a positive number");
        }
        this.radius = radius;
    }

    public double calculateArea() {
        return PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * PI * radius;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the radius of the circle: ");
            double radius = scanner.nextDouble();

            Circle circle = new Circle(radius);

            System.out.println("Area: " + circle.calculateArea());
            System.out.println("Circumference: " + circle.calculateCircumference());
        }
    }
}
