package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int flag=0;
        while(flag == 0){
            System.out.println("Operation Choices:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.println("Enter a choice: ");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.print("Enter the first number: ");
                    int num1 = scanner.nextInt();

                    System.out.print("Enter the second number: ");
                    int num2 = scanner.nextInt();

                    int res1 = add(num1, num2);
                    System.out.println("Result: "+ res1);
                    break;

                case 2:
                    System.out.print("Enter the first number: ");
                    int a1 = scanner.nextInt();

                    System.out.print("Enter the second number: ");
                    int b1 = scanner.nextInt();

                    int res2 = sub(a1, b1);
                    System.out.println("Result: "+ res2);
                    break;

                case 3:
                    System.out.print("Enter the first number: ");
                    int a2 = scanner.nextInt();

                    System.out.print("Enter the second number: ");
                    int b2 = scanner.nextInt();

                    int res3 = mul(a2, b2);
                    System.out.println("Result: "+ res3);
                    break;

                case 4:
                    System.out.print("Enter the first number: ");
                    int a3 = scanner.nextInt();

                    System.out.print("Enter the second number: ");
                    int b3 = scanner.nextInt();

                    int res4 = div(a3, b3);
                    System.out.println("Result: "+ res4);
                    break;

                case 5:
                    flag = 1;
                    break;

                default:
                    System.out.println("Invalid Input");
                    flag=1;
                    break;
            }
        }
    }

    public static int add(int a, int b){
        return a+b;
    }

    public static int sub(int a, int b){
        return a-b;
    }

    public static int mul(int a, int b){
        return a*b;
    }

    public static int div(int a, int b){
        return a/b;
    }

}