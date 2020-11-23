package pac;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字");
        while (true) {
            int t = sc.nextInt();
            if (t == 1) {
                int x = (int) (Math.random() * t * 100 % 100);
                int y = (int) (Math.random() * t * 100 % 100);
                System.out.println(x + "," + y);
            }else {
                System.out.println("输入的字数错误！");
            }
        }
    }
}
