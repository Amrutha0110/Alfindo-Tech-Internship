import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);

        double num1, num2, result = 0; // Declare variables to store numbers and the result
        char operator; // Declare a variable to store the operator

        // Prompt the user to enter the first number
        System.out.print("Enter first number: ");
        num1 = input.nextDouble();

        // Prompt the user to enter the operator
        System.out.print("Enter operator (+, -, *, /): ");
        operator = input.next().charAt(0); // Read the first character of the input as the operator

        // Prompt the user to enter the second number
        System.out.print("Enter second number: ");
        num2 = input.nextDouble();

        // Use a switch statement to perform the chosen operation
        switch (operator) {
            case '+': // If the operator is '+'
                result = num1 + num2; // Perform addition
                break; // Exit the switch statement

            case '-': // If the operator is '-'
                result = num1 - num2; // Perform subtraction
                break; // Exit the switch statement

            case '*': // If the operator is '*'
                result = num1 * num2; // Perform multiplication
                break; // Exit the switch statement

            case '/': // If the operator is '/'
                if (num2 != 0) { // Check for division by zero to prevent error
                    result = num1 / num2; // Perform division
                } else {
                    System.out.println("Error: Division by zero is not allowed."); // Handle division by zero
                    return; // Exit the program if division by zero occurs
                }
                break; // Exit the switch statement

            default: // If the operator is invalid
                System.out.println("Invalid operator!"); // Display an error message
                return; // Exit the program
        }

        // Print the final result
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
}
