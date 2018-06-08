package Class0607;

import java.util.Arrays;

/**
 * Created by dell on 2018/6/7.
 */
public class charuyuansu {
    public static void main(String[] args) {
        int[] a=new int[]{1,2,3,4,5,6};
        a=insertTo(a,0,4);
        for (int b:a){
            System.out.println(b);
        }
    }
    public static int[] insertTo(int[] a,int obj,int index){
        if(index<0||index>=a.length){
            System.out.println("插入失败");
            return null;
        }
       int[] b= Arrays.copyOf(a,a.length+1);
        for (int i=a.length-1;i>=index;i--){
            b[i+1]=b[i];
        }
        b[index]=obj;
        return b;
    }
}
