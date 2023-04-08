import java.util.zip.ZipEntry;

public class code80 {
    public static void main(String[] args) {

        int n=153;
        int x=n%10;
               int y=n/10%10;
               int z=n/100%10;
               if (x*x*x+y*y*y+z*z*z==n){
                   System.out.println("这是一个水仙花数");
               }else System.out.println("这不是水仙花数");
    }
}
