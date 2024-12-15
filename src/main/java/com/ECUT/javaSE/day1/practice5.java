package com.ECUT.javaSE.day1;

import java.util.Scanner;

public class practice5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个月的第几天：");
        int day = sc.nextInt();

        //计算这一天是周几
        int dayOfWeek = (day - 1) % 7 + 1;

        //计算这一天是第几周
        int week = (day - 1) / 7 + 1;
        System.out.println("这一天是当月的第" + week + "周，星期" + dayOfWeek);
    }
}
