package com.company;

public class Main {
    public static int num=1;
    static {
        num =2;
    }
    public static void main(String[] args) {
	// write your code here
        System.out.println(num);
    }
}
