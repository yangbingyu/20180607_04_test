package test;

import java.util.Arrays;

/**
 * Created by dell on 2018/6/7.
 */
public class Test4 {
    public static void main(String[] args) {
        char a[]=new char[]{'a','c','u','b','e','p','f','z'};

        a=Arrays.copyOf(a,a.length+1);
        a[a.length-1]='v';
        System.out.print("原字符序列：");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.print("\n升序排序后：");
        Arrays.sort(a);                    //通过Arrays类的静态sort()方法可以实现对数组的排序。
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
