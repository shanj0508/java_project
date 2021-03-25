package TestPackage;

import java.util.Scanner;
/*
使用switch实现一个简单的石头、剪子、布游戏。
* */

public class DemoSwitch {
    public static void main(String[] args) {
        //系统随机数
        int sys_option = (int)(1+Math.random()*(3-1+1));
        System.out.println("系统随机数为："+sys_option);
        //用户输入值
        Scanner scanner = new Scanner(System.in); // 创建Scanner对象
        System.out.print("石头剪刀布游戏开始：\n1.石头\n2.剪刀\n3.布\n");
        System.out.print("请输入对应的数字：");
        int option = scanner.nextInt();
        System.out.print("用户输入的数字为:"+option);
        //比较输赢???

        switch (sys_option) {
            case 1:
                System.out.println("Selected 1");
                break;
            case 2:
                System.out.println("Selected 2");
                break;
            case 3:
                System.out.println("Selected 3");
                break;
            default:
                System.out.println("Not selected");
                break;
        }
    }
}
