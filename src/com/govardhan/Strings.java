package com.govardhan;

import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {

        String name = Name();


    }

    static String Name() {

        Scanner in = new Scanner(System.in);
        System.out.print("Plz enter the name ");
        String be = in.next();


        System.out.println("Your name is "+be);

     return be;
    }


}
