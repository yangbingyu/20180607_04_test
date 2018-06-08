package test;

import java.util.Arrays;

/**
 * Created by dell on 2018/6/7.
 */
public class Test3 {
    public static void main(String[] args){
        char a[]=new char[]{'a','c','u','b','e','p','f','z'}; //定义字符型的一维数组
        System.out.print("原字符序列：");
        for(int i=0;i<a.length;i++){
        System.out.print(a[i]+" ");
    }
  System.out.print("\n升序排序后：");
  Arrays.sort(a);                    //通过Arrays类的静态sort()方法可以实现对数组的排序。
  for(int i=0;i<a.length;i++){
   System.out.print(a[i]+" ");
}

  System.out.print("\n逆序输出为：");
          //冒泡排序
          char temp='0';
          for(int i=0;i<a.length;i++){
                for(int j=i+1;j<a.length;j++){
                    if(a[j]>a[i]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    }
                }
                System.out.print(a[i]+" ");
          }
    }
}
