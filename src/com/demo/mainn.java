package com.demo;

import com.demo.controller.hello_test;

public class mainn {

    public static final hello_test sss= new hello_test();
    public static final int[] arr = {1,2,3,4,5};

    public  static void test1(){
        sss.sout();
    }

    public static void test2(){
        int result = sss.calcuate_max(arr);
        System.out.println(result);
    }

    public static void main(String[] args) {
//        test1();
        test2();
    }
}