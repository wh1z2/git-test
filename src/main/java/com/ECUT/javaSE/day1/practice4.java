package com.ECUT.javaSE.day1;

import java.util.Scanner;

public class practice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        int num = sc.nextInt();

        int sum = 0;
        String str = num + "=";
        System.out.println(str);
        while (num > 0) {
            String digits = "";
            digits = digits + num % 10;
            str = digits + "+" + str;
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println(str + sum);
    }
}
