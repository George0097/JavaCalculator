import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
                    System.out.println("Can't divide by zero");
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
