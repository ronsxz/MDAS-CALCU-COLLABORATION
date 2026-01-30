import java.util.Scanner;

public class main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double num1 = 0;
        double num2 = 0;
        double result = 0;

        System.out.print("Enter first number: ");
        num1 = scan.nextDouble();
        System.out.print("Enter second number: ");
        num2 = scan.nextDouble();
        System.out.print("Enter operators (+, -, *): ");
        char operators = scan.next().charAt(0);

        switch(operators){     
            case '*':
                result = multiplication(num1, num2);     
            case '-':
                result = subtraction(num1, num2)               
            case '+':
                result = addition(num1, num2);
                break;
            default:
                System.out.println("Invalid operator");
                
        }
        System.out.println("Result: " + result);
        scan.close();
    }
    public static double multiplication(double num1, double num2){
        return num1 * num2;
    }
    public static double subtraction(double num1, double num 2){
        return num1 - num2;
    }
    public static double addition(double num1, double num2){
        return num1 + num2;
    }
}