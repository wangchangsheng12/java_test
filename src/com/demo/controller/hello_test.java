package com.demo.controller;

public class hello_test {

    public void sout(){
        System.out.println("Helloworld");
    }

    public int calcuate_max(int[] arr) {
        int length = arr.length;
        int max_value = 0;
        for (int i = 0; i < length; i++) {
            if(arr[i]>max_value){
                max_value = arr[i];
            }
        }
        return max_value;
    }

}
