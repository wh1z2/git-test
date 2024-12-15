package com.ECUT.javaSE.day2;

import java.util.Scanner;

public class practice2 {
    /*
    正确系统输出：登录成功
    错误系统输出：
        1.只会输出用户名不存在，而不会输出密码错误
        2.用户不存在和密码错误会同时输出
     系统默认的用户名和密码：
        用户名：admin
        密码：123456
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String name = sc.next();
        System.out.println("请输入密码：");
        String pass = sc.next();
        //a&&b  a为false时，b不执行
        //a&b  a为false时，b仍执行
        if (checkUser(name) && checkPass(pass)) {
            System.out.println("登录成功");
        }
    }
    private static boolean checkUser(String username) {
        boolean flag = true;
        //细节：admin写在前面来.equals(),如果写在后面，而username为null，就会报空指针异常，因为null没有equals方法
        //后面的所有逻辑都不会执行，对于一个项目来说，这里爆了异常就会导致整个项目宕机
        //所以为了健壮性admin写在前面来.equals()
        if (!"admin".equals(username)) {
            System.out.println("用户名错误");
            flag = false;
        }
        return flag;
    }

    private static boolean checkPass(String password) {
        boolean flag = true;
        if (!"123456".equals(password)) {
            System.out.println("密码错误");
            flag = false;
        }
        return flag;
    }
}
