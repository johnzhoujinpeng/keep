package abc;
import java.util.Scanner; 
public class a1 {
	 public static void main (String[]args) {

			Scanner sc = new Scanner(System.in);
			System.out.println("请输入一个整数");
			int x = sc.nextInt();
			int num=0;
			int temp=x;
			while(x!=0) {
				int ge = x%10;
				x=x/10;
				num=num*10+ge;
				
			}
	System.out.println(num);
	if (num==temp) {
		System.out.println(true);
	} 
	
//	sd
	
	
	 }
}
