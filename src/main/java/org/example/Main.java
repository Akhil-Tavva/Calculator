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
                    int num1 = Integer.parseInt(scanner.nextLine());

                    System.out.print("Enter the second number: ");
                    int num2 = Integer.parseInt(scanner.nextLine());

                    int res1 = add(num1, num2);
                    System.out.println("Result: "+ res1);
                    break;

                case 2:
                    System.out.print("Enter the first number: ");
                    int a = Integer.parseInt(scanner.nextLine());

                    System.out.print("Enter the second number: ");
                    int b = Integer.parseInt(scanner.nextLine());

                    int res2 = sub(a, b);
                    System.out.println("Result: "+ res2);
                    break;

                case 3:
                    System.out.print("Enter the first number: ");
                    int c = Integer.parseInt(scanner.nextLine());

                    System.out.print("Enter the second number: ");
                    int d = Integer.parseInt(scanner.nextLine());

                    int res3 = mul(c, d);
                    System.out.println("Result: "+ res3);
                    break;

                case 4:
                    System.out.print("Enter the first number: ");
                    int e = Integer.parseInt(scanner.nextLine());

                    System.out.print("Enter the second number: ");
                    int f = Integer.parseInt(scanner.nextLine());

                    int res4 = div(e, f);
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