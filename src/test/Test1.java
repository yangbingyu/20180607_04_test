package test;

import java.util.Scanner;

/**
 * Created by dell on 2018/6/7.
 */
public class Test1 {
    public static void main(String[] args) {
        double[] a=new double[5];
        double sum=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入会员本月的消费记录");
        for (int i=0;i<a.length;i++){
            System.out.println("请输入第"+(i+1)+"笔购物金额：");
            a[i]=scanner.nextDouble();
            sum+=a[i];
        }
        System.out.println("序号\t金额（元）");
        for(int i=0;i<a.length;i++){
            System.out.println((i+1)+"\t\t"+a[i]);
        }
        System.out.println("总金额\t"+sum);
    }
}
