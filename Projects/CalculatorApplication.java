package Projects;

import java.util.Scanner;

public class CalculatorApplication {
    public static void main(String[] args) {
        CalculatorApplication obj = new CalculatorApplication();


        Scanner sc = new Scanner(System.in);
        System.out.println("Choose an operation: (*, +, -, %, /)");
        System.out.println("->");

        //take input from user and define which operation to perform 
        String input = sc.next();
        char ch = input.charAt(0);
        obj.chooseOperation(ch);
        System.out.println("Do you want to exit");
        String exitInput = sc.next();
        char ch1 = input.charAt(0);
        if(ch1 == 'y')

        
    }
    public void chooseOperation(char ch){
        switch (ch) {
            case '*':
                System.out.println("multiplication");
                break;
            case '+':
                System.out.println("addition");
                break;
            case '-':
                System.out.println("subtraction");
                break;
            case '/':
                System.out.println("division");
                break;
            case '%':
                System.out.println("modulo");
                break;
            default:
                System.out.println("unknown operation");
        }

    }

}
