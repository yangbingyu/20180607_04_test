package test;

import java.util.Scanner;

/**
 * Created by dell on 2018/6/7.
 */
public class Test8 {
    public static void main(String[] args) {
        int[] a=new int[5];
        int b=0;
        Scanner scanner=new Scanner(System.in);
        for (int i=0;i<a.length;i++){
            System.out.println("请输入第"+(i+1)+"个数字：");
            a[i]=scanner.nextInt();
            if (a[i]%2==0){
                b++;
            }
        }
        System.out.println("数组中下标为奇数的成员是：");
        System.out.println("a[1]="+a[1]);
        System.out.println("a[3]="+a[3]);
        System.out.println("总共输入："+b+"个偶数");
    }
}
