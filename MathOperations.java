/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mathoperations;

/**
 *
 * @author P5YC40_K7113R
 */
public class MathOperations {
    public static void main(String[] args) {
        // Step 1: Define two fixed numbers
        int num1 = 50;
        int num2 = 20;
        
        // Step2: Perform four different mathematical operations
        int sum = num1 + num2; // Addition
        int difference = num1 - num2; // subtraction
        int product = num1 * num2; // Multiplication
        double quotient = (double) num1 / num2; // Division, cast to double for accuracy
        
        // Step 3: Print the results of the calculations
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        
        // Step 4: Calculate the average of the results
        double average = (sum + difference + product + quotient) / 4.0;
        
        // Step 5: Print the average
        System.out.println("Average: " + average);
        
        // Step 6: Print a string based on whether the average is lower or higher than 100
        if (average > 100) {
            System.out.println("The average is higher than 100.");
        } else {
            System.out.println("The average is lower than or equal to 100.");
        }
    }
}