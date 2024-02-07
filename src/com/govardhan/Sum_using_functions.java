package com.govardhan;


import java.util.Scanner;

public class Sum_using_functions {
    public static void main(String[] args) {

        Sum();

    }


    static void Sum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = in.nextInt();
        int sum =num1+num2;
        System.out.println("The sum is :" +sum);



    }

}
