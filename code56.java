package code;

public class code56 {

	public static void main(String[]args) {
		
		double x=11.0;
		double y=19.0;
		
		if(x>10.0&&y<20.0) {
			System.out.println("两个数的和为"+x+y);
		}
		
		int a=10;
		int b=20;
		if((a+b)%3==0&&(a+b)%5==0) {
			
			System.out.println("这两个数的和可以被3和5整除");
		}else {
			System.out.println("和不能被3和5整除");
		}
		
		
		
		int r=2004;
		if((r%4==0&r%100!=0)||(r%400==0)) {
			
			System.out.println("这是一个闰年");
			
			
		
		}else {
			System.out.println("这不是一个闰年");
		}
		
	}
}
