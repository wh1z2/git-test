package homework;

import org.junit.Test;

import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        //程序一
        //program1();
        //程序二
        //program2();
        //程序三
        //program3();
        //程序四
        program4();
    }

    private static void program4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个整数n(0 <= n <= 360): ");
        int n = scanner.nextInt();
        if (n < 0 || n > 360) {
            System.out.println("输入超出范围");
            return;
        }

        // 每个月默认是30天，一年共12个月
        int month = (n - 1) / 30 + 1; // 计算属于哪个月
        int dayInMonth = ((n - 1) % 30) + 1; // 当前月的第几天
        int remainingDays = 360 - n; // 剩余天数
        System.out.println("该天数属于第" + month + "个月, 该月的第" + dayInMonth + "天");
        System.out.println("一年中还剩下的天数: " + remainingDays);
    }

    private static void program3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入第一个整数a: ");
        int a = scanner.nextInt();
        System.out.print("请输入第二个整数b: ");
        int b = scanner.nextInt();

        System.out.println("交换前: a = " + a + ", b = " + b);

        // 交换变量值
        int temp = a;
        a = b;
        b = temp;

        System.out.println("交换后: a = " + a + ", b = " + b);
    }

    private static void program2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个年份: ");
        int year = scanner.nextInt();

        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        int februaryDays = isLeap ? 29 : 28;

        if (februaryDays == 28){
            System.out.println(year + "不是闰年");
            System.out.println(year + "年的二月有" + februaryDays + "天");
        }else {
            System.out.println(year + "是闰年");
            System.out.println(year + "年的二月有" + februaryDays + "天");
        }


    }

    private static void program1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入第一个整数a: ");
        int a = scanner.nextInt();
        System.out.print("请输入第二个整数b: ");
        int b = scanner.nextInt();

        if (b != 0) {
            System.out.println("和: " + (a + b));
            System.out.println("差: " + (a - b));
            System.out.println("积: " + (a * b));
            System.out.println("商(整数部分): " + (a / b));
            System.out.println("余数: " + (a % b));
        } else {
            System.out.println("除数不能为0");
        }
    }

}
