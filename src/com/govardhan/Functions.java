package com.govardhan;

public class Functions {


        public static void main(String[] args) {
          int ans =  sum3(30,40);
            System.out.println(ans);

            String personal = MyGreet("govardhan");
            System.out.println(personal);

        }
        static int sum3(int a,int b){
            int sum =a+b;
            return sum;

        }
        static String MyGreet(String name ){

            String message = "hello world" + " "+ name;

            return message;
        }





}

