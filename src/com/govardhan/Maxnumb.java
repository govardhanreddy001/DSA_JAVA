package com.govardhan;

import java.util.Scanner;

public class Maxnumb {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
int max;
        max = 0;

        if(a>b){

            max=a;


        }
        else {
            max = b;
        }

        System.out.println(max);
        }
    }
