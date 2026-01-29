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
            default:
        }
        System.out.println("Result: " + result);
        scan.close();
    }
}