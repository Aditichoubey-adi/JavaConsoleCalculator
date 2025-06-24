import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true; // Control variable for the loop

        while (running) {
            System.out.println("\nJava Console Calculator");
            System.out.println("-----------------------");
            System.out.println("Select an operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Modulo (%)"); // New Operation
            System.out.println("6. Power (x^y)"); // New Operation
            System.out.println("7. Exit"); // Exit option number changed
            System.out.print("Enter your choice (1-7): "); // Prompt updated

            int choice = 0;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 7."); // Updated message
                continue;
            }

            if (choice == 7) { // Exit choice updated to 7
                running = false;
                System.out.println("Exiting calculator. Goodbye!");
                break;
            }

            if (choice < 1 || choice > 6) { // Valid operation choices updated
                System.out.println("Invalid choice. Please enter a number between 1 and 7."); // Updated message
                continue;
            }

            System.out.print("Enter first number: ");
            double num1 = 0;
            try {
                num1 = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input for first number. Please enter a valid number.");
                continue;
            }

            System.out.print("Enter second number: ");
            double num2 = 0;
            try {
                num2 = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input for second number. Please enter a valid number.");
                continue;
            }

            double result = 0;
            String operationSymbol = "";

            switch (choice) {
                case 1:
                    result = add(num1, num2);
                    operationSymbol = "+";
                    break;
                case 2:
                    result = subtract(num1, num2);
                    operationSymbol = "-";
                    break;
                case 3:
                    result = multiply(num1, num2);
                    operationSymbol = "*";
                    break;
                case 4:
                    result = divide(num1, num2);
                    operationSymbol = "/";
                    break;
                case 5: // New Case for Modulo
                    result = modulo(num1, num2);
                    operationSymbol = "%";
                    break;
                case 6: // New Case for Power
                    result = power(num1, num2);
                    operationSymbol = "^";
                    break;
            }

            // Division by zero ya modulo by zero errors ko handle karne ke liye
            if (Double.isNaN(result)) {
                // Error message already printed by the respective methods (divide, modulo)
                // So, no need to print anything extra here, just continue to next loop iteration
                continue;
            } else {
                System.out.println("Result: " + num1 + " " + operationSymbol + " " + num2 + " = " + result);
            }
        }

        scanner.close();
    }

    // Existing Methods:
    public static double add(double num1, double double2) {
        return num1 + double2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Cannot divide by zero!");
            return Double.NaN;
        }
        return num1 / num2;
    }

    // NEW METHODS ADDED BELOW:

    // Method for Modulo (Remainder)
    public static double modulo(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Cannot perform modulo with zero!");
            return Double.NaN; // Not a Number
        }
        return num1 % num2;
    }

    // Method for Power (num1 raised to the power of num2)
    public static double power(double base, double exponent) {
        if (base == 0 && exponent == 0) {
            System.out.println("Error: 0 raised to the power of 0 is undefined. Returning 1 (common convention).");
            return 1.0; // Common convention for 0^0, or could return Double.NaN
        }
        // Math.pow() method is used for power calculations
        return Math.pow(base, exponent);
    }
}