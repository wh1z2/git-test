package com.ECUT.javaSE.day2;

public class practice4 {
    public static void main(String[] args) {
        outerLoop://这个名字只属于这里的最外面的循环
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println("第" + i + "天,吃了第" + j + "个苹果");
                if (i == 4 && j == 2) {
                   break outerLoop;//直接跳出名为outerLoop的for循环
                }
            }
        }
    }
}
