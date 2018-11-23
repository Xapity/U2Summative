/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u2culminating;

import java.util.Scanner;

/**
 *
 * @author camac2045
 */
public class U2Culminating {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int choice;
        Scanner keyedInput = new Scanner(System.in); //scanner declared
        System.out.println("Callum's Crazy Cool Calculator\n***************************\nWhat function would you like to use?\n1 = Addition\n2 = Substraction\n3 = Multiplication\n4 = Division\n5 = Exponents\n6 = Roots\n7 = Prime Check\n8 = Exit!");
        choice = keyedInput.nextInt();
        double answer = 0;
        switch (choice) {
            case 1:
                answer = ADD(answer);
                System.out.println("Answer = "+answer);
                break;
            case 2:
                answer = SUB(answer);
                System.out.println("Answer = "+answer);
                break;
            case 3:
                answer = MUL(answer);
                System.out.println("Answer = "+answer);
                break;
            case 4:
                answer = DIV(answer);
                System.out.println("Answer = "+answer);
                break;
            case 5:
                answer = EXP(answer);
                System.out.println("Answer = "+answer);
                break;
            case 6:
                answer = SQR(answer);
                System.out.println("Answer = "+answer);
                break;
            case 7:
                PRI();
                break;
            case 8:
                System.exit(0);
                break;
                
        }
        
    }
    /**
    * It adds 2 numbers
    * @param answer = the method will calculate for answer
    * @return answer the end result
    */
    public static double ADD(double answer) {
        double num1, num2;
        Scanner keyedInput = new Scanner(System.in); //scanner declared
        System.out.println("Enter the numbers you would like added together(a+b):");
        num1 = keyedInput.nextDouble();
        num2 = keyedInput.nextDouble();
        //System.out.println("Answer = " + (num1 + num2));
        answer = (num1 + num2);
        return answer;
    }
    /**
    * It subtracts 2 numbers
    * @param answer = the method will calculate for answer
    * @return answer the end result
    */
    public static double SUB(double answer) {
        double num1, num2;
        Scanner keyedInput = new Scanner(System.in); //scanner declared
        System.out.println("Enter the numbers you would like substracted together(a-b):");
        num1 = keyedInput.nextDouble();
        num2 = keyedInput.nextDouble();
        //System.out.println("Answer = " + (num1 - num2));
        answer = (num1 - num2);
        return answer;
    }
    /**
    * It multiplies 2 numbers
    * @param answer = the method will calculate for answer
    * @return answer the end result
    */
    public static double MUL(double answer) {
        double num1, num2;
        Scanner keyedInput = new Scanner(System.in); //scanner declared
        System.out.println("Enter the numbers you would like multiplied together(a*b):");
        num1 = keyedInput.nextDouble();
        num2 = keyedInput.nextDouble();
        //System.out.println("Answer = " + (num1 * num2));
        answer = (num1 * num2);
        return answer;
    }
    /**
    * It divides 2 numbers
    * @param answer = the method will calculate for answer
    * @return answer the end result
    */
    public static double DIV(double answer) {
        double num1, num2;
        Scanner keyedInput = new Scanner(System.in); //scanner declared
        System.out.println("Enter the numbers you would like divided(a/b):");
        num1 = keyedInput.nextDouble();
        num2 = keyedInput.nextDouble();
        //System.out.println("Answer = " + (num1 / num2));
        answer = (num1 / num2);
        return answer;
    }
    /**
    * It takes a base then puts it to the power of another number
    * @param answer = the method will calculate for answer
    * @return answer the end result
    */
    public static double EXP(double answer) {
        double num1, num2, num3;
        Scanner keyedInput = new Scanner(System.in); //scanner declared
        System.out.println("Please enter the base for the exponent");
        num1 = keyedInput.nextDouble();
        num3 = num1;
        //System.out.println("Please enter the exponent");
        num2 = keyedInput.nextDouble();
        for (int i = 2; i <= num2; i++) {
            num1 = num1 * num3;
        }
        System.out.println(num1);
        answer = num1;
        return answer;
    }
    /**
    * It takes a root of a number 
    * @param answer = the method will calculate for answer
    * @return answer the end result
    */
    public static double SQR(double answer) {
        double num1, num2;
        Scanner keyedInput = new Scanner(System.in); //scanner declared
        System.out.println("Enter the base first and then the root next(a to the root(b)):");
        num1 = keyedInput.nextDouble();
        num2 = keyedInput.nextDouble();
        answer = Math.pow(num1, 1 / num2);
        //System.out.println("Answer = " + answer);
        answer = Math.pow(num1, 1 / num2);
        return answer;
    }
    /**
    * It finds if a number is prime or not
    * @param (null) = everything is declared in the method
    * @return the inputted number
    */
    public static double PRI() {
        Scanner keyedInput = new Scanner(System.in); //scanner declared
        System.out.println("Enter any integer to see if it is prime:");
        int num1;
        num1 = keyedInput.nextInt();

        if (num1 != 0) {
            if (num1 == 2) {
                System.out.println("The number is prime!");
                num1 = 0;
            }
            if (num1 == 1) {
                System.out.println("The number is not prime.");
            }
            for (int i = 1; i < num1; i++) {
                if (num1 % i == 0) {
                    System.out.println("The number is not prime.");
                    num1 = 0;
                } else {
                    System.out.println("The number is prime!");
                    num1 = 0;
                }
            }
        }
        return num1;
    }
}
