import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Simple Calculator!");
        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        double result;

        switch (operator) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                if (secondNumber == 0) {
                    System.out.println("Error");
                    return;
                }
                result = firstNumber / secondNumber;
                break;
            default:
                System.out.println("Error");
                return;
        }
        System.out.printf("Result: %.2f %c %.2f = %.2f\n", firstNumber, operator, secondNumber, result);
    }
}
