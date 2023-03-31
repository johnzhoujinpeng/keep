package code;

import java.util.Scanner;

public class code57 {
	
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入保国同志的信誉分");
		int xin=sc.nextInt();
		
		if(xin>=1&&xin<=100) {
		
		if(xin==100) {
			System.out.println("信用极好");
			
		}else if(xin>80&&xin<=99) {
			
			System.out.println("信用优秀");
			
		}else if(xin>=60&&xin<=80) {
			
			System.out.println("信用一般");
			
		}else {
			
			System.out.println("信用不及格");
		}
		
		}else {
			System.out.println("信用分应该在1到100,请重新输入");
		}
		
	}

}
