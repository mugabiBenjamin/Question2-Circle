/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.circle;

/**
 *
 * @author Benjn
 */
import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter value of a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter value of b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter value of c: ");
        double c = scanner.nextDouble();

        // Calculate the discriminant
        double discriminant = calculateDiscriminant(a, b, c);

        // Solve the quadratic equation
        if (discriminant > 0) {
            double root1 = calculateRoot(a, b, discriminant, true);
            double root2 = calculateRoot(a, b, discriminant, false);
            System.out.println("Roots are real and different.");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (discriminant == 0) {
            double root = calculateRoot(a, b, discriminant, true);
            System.out.println("Roots are real and equal.");
            System.out.println("Root: " + root);
        } else {
            double realPart = calculateRealPart(a, b);
            double imaginaryPart = calculateImaginaryPart(a, discriminant);
            System.out.println("Roots are complex.");
            System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
        }
        scanner.close();
    }

    private static double calculateDiscriminant(double a, double b, double c) {
        return b * b - 4 * a * c;
    }

    private static double calculateRoot(double a, double b, double discriminant, boolean isPositive) {
        return (-b + (isPositive ? Math.sqrt(discriminant) : -Math.sqrt(discriminant))) / (2 * a);
    }

    private static double calculateRealPart(double a, double b) {
        return -b / (2 * a);
    }

    private static double calculateImaginaryPart(double a, double discriminant) {
        return Math.sqrt(-discriminant) / (2 * a);
    }
}

