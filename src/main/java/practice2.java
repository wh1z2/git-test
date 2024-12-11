import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的姓：");
        String surname = sc.next();

        System.out.println("请输入您的名：");
        String name = sc.next();

        System.out.println("请输入您的年龄：");
        byte age = sc.nextByte();

        System.out.println("请输入您的性别：");
        String gender = sc.next();

        System.out.println("请输入您的薪水：");
        double salary = sc.nextDouble();

        System.out.println("请输入您是否在职(true/false)：");
        boolean isJob = sc.nextBoolean();

        System.out.println("姓：" + surname + "，名：" + name + "，年龄：" + age + "岁，性别：" + gender + "，月薪是" + salary + "元，是否在职：" + isJob);
    }
}
