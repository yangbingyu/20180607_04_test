package Class0607;

import java.util.Arrays;

/**
 * Created by dell on 2018/6/7.
 */
public class sort {
    public static void main(String[] args) {
        int[] b=new int[]{12,1,25,32,14};
        System.out.println(getSort(b));
    }
    public static int[] getSort(int[] a) {
        for (int i=1;i<a.length;i++){
            int index=-1;
            int temp=a[i];
            for (int j=i-1;j>=0;j--){
                if (temp<a[j]){
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
        return a;
    }
}
