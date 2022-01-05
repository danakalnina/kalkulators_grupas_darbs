package com.dana;
import java.util.Scanner;

public class Main {


    public static void main(String[] args)
    {
        int num1;
        int num2;
        String operation;


        Scanner input = new Scanner(System.in);

        System.out.println("ievadi pirmo ciparu");
        num1 = input.nextInt();

        System.out.println("ievadi otro ciparu");
        num2 = input.nextInt();

        Scanner op = new Scanner(System.in);

        System.out.println("ievadi vēlamo operāciju");
        operation = op.next();

        if (operation.equals("+"))
        {
            System.out.println("your answer is" + (num1 + num2));
        }
        if  (operation.equals("-"))
        {
            System.out.println("your answer is" + (num1 - num2));
        }

        if (operation.equals("/"))
        {
            System.out.println("your answer is" + (num1 / num2));
        }
        if (operation.equals("*"))
        {
            System.out.println("your answer is" + (num1 * num2));
        }


    }
}