package test;

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by dell on 2018/6/7.
 */
public class Test2 {
    public static void main(String[] args) {
        int[] a=new int[]{99,85,82,63,60};
        a= Arrays.copyOf(a,a.length+1);
        a[a.length-1]=90;

        for (int i=1;i<a.length;i++){
            int index=-1;
            int temp=a[i];
            for (int j=i-1;j>=0;j--){
                if (temp>a[j]){
                    a[j+1]=a[j];
                }else{
                    index=j;
                    break;
                }
            }
            a[index+1]=temp;
        }
        for (int b:a){
            System.out.println(b);
        }

    }
}
