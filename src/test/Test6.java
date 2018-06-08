package test;

import java.util.Scanner;

/**
 * Created by dell on 2018/6/7.
 */
public class Test6 {
    public static void main(String[] args) {
        int[] a=new int[]{55,21,36,48,69};
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num=scanner.nextInt();
        boolean b=true;
        for (int i=0;i<a.length;i++){
            if (num==a[i]){
                System.out.println("猜对了");
                b=true;
                break;
            }else {
                b=false;
            }
        }
        if (b==false){
            System.out.println("sorry");
        }

    }
}
