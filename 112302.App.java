package pac;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字");
        while (true) {
            int t;
            Thread.sleep(100);
            System.out.println((int)(Math.random()*100%100) + "," + (int)(Math.random()*100%100));

        }
    }
}
