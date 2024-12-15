package com.ECUT.javaSE.day2;

public class practice1 {
    public static void main(String[] args) {
        int a = 5;  //0101
        int b = 10; //1010

        System.out.println("Before swap: a = " + a + ", b = " + b);

        // 使用异或运算进行交换
        // 原理：异或运算满足交换律和结合律，且对任何数与0进行异或运算都不会改变该数的值
        // 异或运算的结果是两个数的二进制表示中不同的位为1，相同的位为0
        a = a ^ b;//结果为1111
        b = a ^ b;//结果为0101，即5
        a = a ^ b;//结果为1010，即10

        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}
