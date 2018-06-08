package test;

import java.util.Scanner;

/**
 * Created by dell on 2018/6/7.
 */
public class Test9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] num=new int[5];
        System.out.println("请输入一个五位数");
        int n=sc.nextInt(); //把每一位数放到数组中
        for(int i=num.length-1;i>=0;i--) {
            num[i]=n%10; n/=10;
        }
        //判断是否是回文数
        //第一位数字==最后一位数字
        //第二位数字==倒数第二位数字
        for(int i=0;i<num.length/2;i++) {
            if(num[i]!=num[num.length-1-i]) {
                System.out.println("这个数字不是回文数");
                return;
            }
        }
        System.out.println("这个数字是回文数");
    }
}

