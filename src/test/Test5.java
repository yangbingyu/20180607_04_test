package test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by dell on 2018/6/7.
 */
public class Test5 {
    public static void main(String[] args) {
        int[] a=new int[4];
        System.out.println("请输入4家店的价格");
        Scanner scanner=new Scanner(System.in);
        for (int i=0;i<a.length;i++){
            System.out.println("第"+(i+1)+"店的价格：");
            a[i]=scanner.nextInt();
        }
        Arrays.sort(a);
        System.out.println("最低价格是："+a[0]);
    }
}
