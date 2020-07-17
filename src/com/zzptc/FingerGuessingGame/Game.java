package com.zzptc.FingerGuessingGame;

import java.util.Scanner;

/**
 * @author wangqingbo
 * @create 2020-07-16-22:18
 */
public class Game {
    User user = new User();
    Computer computer = new Computer();
    int count;
    int ping;

    //对战准备
    public void init() {
        System.out.println("请输入你的姓名：\n");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        user.name = name;
        System.out.println("请输入对手姓名：\n1.张三\t2.李四\t3.王五");
        int choice = input.nextInt();
        if (choice == 1) {
            computer.name = "张三";
        } else if (choice == 2) {
            computer.name = "李四";
        } else if (choice == 3) {
            computer.name = "王五";
        } else {
            System.out.println("你输入有误");
        }
        System.out.println("您选择了与" + computer.name + "对战");
    }

    //每一次的对战结果
    public void calcResult(int useFist, int computerFist) {
        if ((useFist == 1 && computerFist == 2) || (useFist == 2 && computerFist == 3) || (useFist == 3 && computerFist == 1)) {
            System.out.println(user.name + "你赢了 ");
            user.score++;
        } else if ((computerFist == 1 && useFist == 2) || (computerFist == 2 && useFist == 3) || (computerFist == 3 && useFist == 1)) {
            System.out.println(user.name + "你输了");
            computer.score++;
        } else {
            System.out.println("平局");
            ping++;
        }
        count++;
    }

    //开始游戏
    public void start() {
        Scanner input = new Scanner(System.in);
        String isContinue = null;
        init();
        do {
            int useFist = user.showFist();
            int computerFist = computer.showFist();
            calcResult(useFist, computerFist);
            System.out.println("是否继续游戏\ty(继续)\t其他(退出)");
            isContinue = input.next();
        } while ("y".equals(isContinue));
        showResult(user, computer);
    }

    //计算最终结果
    public void showResult(User user, Computer computer) {
        System.out.println(user.name + "\t" + user.score);
        System.out.println(computer.name + "\t" + computer.score);
        if (user.score > computer.score) {
            System.out.println("恭喜" + user.name + "获得了胜利");
            System.out.println("一共进行了" + count + "局,你胜利" + user.score + "局,输了" + (count - ping - user.score) + "局,平局" + ping + "次");
        } else {
            System.out.println("很不幸" + user.name + "输掉了比赛");
            System.out.println("一共进行了" + count + "局,你胜利" + user.score + "局,输了" + (count - ping - user.score) + "局,平局" + ping + "次");
        }
    }


    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }
}
