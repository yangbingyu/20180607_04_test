package test;

import java.util.Scanner;

/**
 * Created by dell on 2018/6/7.
 */
public class Test10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int count=0;
        int sum =0;
        for (;;){
            System.out.println("请输入数字：");
            int input=scanner.nextInt();
            if (input==500){
                break;
            }
            count++;
            if (input%2!=0){
                sum+=input;
            }
        }
        System.out.println("数字个数："+count);
        System.out.println("奇数和："+sum);
    }
}
