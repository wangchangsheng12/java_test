package com.demo;

import com.demo.controller.hello_test;

import java.util.Locale;

public class mainn {

    // 成员变量（全局）
    public static final hello_test sss= new hello_test();
    public static final int[] arr = {1,2,3,4,5};

    /**
     * 测试输出
     */
    public  static void test1(){
        sss.sout();
    }

    /**
     * 找数组最大值
     */
    public static void test2(){
        // 局部变量
        int result = sss.calcuate_max(arr);
        System.out.println("计算结果是：" + result);
    }

    /**
     * char 字符类型
     * 字符串  字符数组   的转换
     */
    public static void test3(){

        // toLowerCase
        String aaa = "Hello";
        System.out.println(aaa.toLowerCase());

        // toCharArray
        char[] chars = aaa.toCharArray();
        System.out.println(chars[1]);
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        // charAt
        char c = aaa.charAt(1);
        System.out.println(c);

        // 判空
        boolean empty = aaa.isEmpty();
        System.out.println(empty);

    }

    /**
     * 逻辑运算符 && || !
     */
    public static void test4(){
        int a = 10;
        if(a > 4 && a < 9){
            System.out.println("true!!!");
        }
    }

    public static void main(String[] args) {
//        test1();
//        test2();
//        test3();
        test4();
    }
}