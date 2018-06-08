package test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by dell on 2018/6/7.
 */
public class Test7 {
    public static void main(String[] args) {
        int[] a=new int[8];
        double sum=0;
        Scanner scanner=new Scanner(System.in);
        for (int i=0;i<a.length;i++){
            System.out.println("请输入第"+(i+1)+"个整数：");
        a[i]=scanner.nextInt();
        sum+=a[i];
    }
        Arrays.sort(a);
        System.out.println("接收数据中最大值为："+a[7]);
        System.out.println("接收数据中最小值为："+a[0]);
        System.out.println("接收数据中平均值为："+(sum/8));
    }
}

