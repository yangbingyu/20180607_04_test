package Class0607;

/**
 * Created by dell on 2018/6/7.
 */
public class Charusort2 {
    public static void main(String[] args) {

        int[] a={4,3,1,2,9,7};
        int b=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    b=a[j];
                    a[j]=a[j+1];
                    a[j+1]=b;
                }
            }
        }
        for(int i=0;i<a.length;i++ ){
            System.out.println(a[i]);

        }
    }


}
