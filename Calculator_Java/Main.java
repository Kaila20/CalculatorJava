//Remeber to put in the imports!
import java.util.Scanner;
import java.util.function.DoubleBinaryOperator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //While loop used for opening act
        while (true) {
            System.out.println("\nSimple Calculator Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            //Entering your choice (choice is Integer)
            System.out.print("Enter your choice (1-5): ");
            int choice = sc.nextInt();

            //If choosen anything else besides 1 - 5, this plays out
            if (choice == 5) {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }

            //Entering the first and second number (num1 and num2 are Doubles)
            System.out.print("Enter the first number: ");
            double num1 = sc.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = sc.nextDouble();

            
            //DoubleBinaryOperator from import
            DoubleBinaryOperator operation = null;


            //switch statements for choices
            //operation used for all choices 
            switch (choice) {
                case 1:
                    operation = (a, b) -> a + b; //add
                    break;
                case 2:
                    operation = (a, b) -> a - b; //subtract
                    break;
                case 3:
                    operation = (a, b) -> a * b; // multiply
                    break;
                case 4:
                    if (num2 != 0) {
                        operation = (a, b) -> a / b; //dividion
                    } else {
                        System.out.println("Cannot divide by zero. Please enter a non-zero divisor.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

            //If not equals null, the result will play and appyas a double.
            if (operation != null) {
                double result = operation.applyAsDouble(num1, num2);
                System.out.println("Result: " + result);
            }
        }
    }
}

