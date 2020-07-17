package com.zzptc.FingerGuessingGame;

import java.util.Scanner;

/**
 * @author wangqingbo
 * @create 2020-07-16-21:41
 */
public class User {
    String name;
    int score;

    //出拳
    public int showFist() {
        System.out.println("请出拳:\n1.石头\t2.剪刀\t3.布");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        if (choice == 1) {
            System.out.println(name + "选择了石头");
        } else if (choice == 2) {
            System.out.println(name + "选择了剪刀");
        } else if (choice == 3) {
            System.out.println(name + "你选择了布");
        } else {
            System.out.println("你输入有误");
        }
        return choice;
    }


}
