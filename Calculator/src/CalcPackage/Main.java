package CalcPackage;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input values from console
        System.out.print("Enter first integer value: ");
        int a = scanner.nextInt();
        
        System.out.print("Enter second integer value: ");
        int b = scanner.nextInt();
        
        // Create a new instance of the Calculator class
        Calculator calculator = new Calculator();
        
        // Call the Calculator methods with the input values and print the output
        System.out.println("Sum: " + calculator.sum(a, b));
        System.out.println("Subtraction: " + calculator.subtract(a, b));
        System.out.println("Multiplication: " + calculator.multiply(a, b));
        
        try {
            System.out.println("Division: " + calculator.divide(a, b));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        scanner.close();
    }
}
