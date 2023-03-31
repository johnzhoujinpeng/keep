package code;

import java.util.Scanner;
public class code59 {

	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入月份");
		int month=sc.nextInt();
	
		
	if(month>=1&&month<=12) {
		if(month>=4&&month<=10) {
			System.out.println("这个月是属于旺季");
			System.out.println("请输入年龄");
			int age=sc.nextInt();
			if(age>=18&&age<=60) {
				System.out.println("票价为六十");
				
			}else if(age<18&&age>=0) {
				System.out.println("票价为半价");
			}else if(age>60)
				System.out.println("票价为三分之一");
	
		}else {
			System.out.println("这个月为淡季");
			System.out.println("请输入年龄");
		int age=sc.nextInt();
		if(age>=18&&age<=60) {
			System.out.println("票价为40");
		}else
			System.out.println("票价为20");
		}
		
	}else System.out.println("输入的月份错误,请重新输入");
		
		
		
		
	}
}
