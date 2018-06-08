package Class0607;

/**
 * Created by dell on 2018/6/7.
 */
public class max {
    public static void main(String[] args) {
        System.out.println(getMax(5,12,1));
    }
    public static int getMax(int a,int b,int c){
        int max=0;
        if (a>b&&a>c){
                max=a;
        }
        if (b>a&&b>c){
                max=b;
        }
        if (c>b&&c>a){
                max=c;
        }
        return max;
    }
}
