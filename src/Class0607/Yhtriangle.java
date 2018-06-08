package Class0607;

/**
 * Created by dell on 2018/6/7.
 */
public class Yhtriangle {
    public static void main(String[] args) {
        int[][] a=new int[10][];
        for (int i=0;i<a.length;i++){
            a[i]=new int[i+1];
            for (int j=0;j<=i;j++){
                if(i==0||j==0||j==i) {
                    a[i][j] = 1;
                }else{
                    a[i][j]=a[i-1][j]+a[i-1][j-1];
                }
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
