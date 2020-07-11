package com.test;

public class TestNgBasics {
    public static void main(String[] args) {


        compare(10,20);
        compare(20,10);
        compare(20,20);

    }


    public static void compare(int a, int b){
        if(a>b){
            System.out.println("a is greater than b");
        }else if(a<b){
            System.out.println("b is greater than a");
        }else{
            System.out.println("Values of a and b are same");
        }
    }


}
