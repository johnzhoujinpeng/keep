package code;

import java.util.Scanner;


public class code54 {
	
	public static void main(String[]args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个年龄");
		
		int age=sc.nextInt();
		
		if(age>18) {
			System.out.println("你年龄大于十八岁,可以对自己的行为负责了,送入监狱");
			
		}else {
			System.out.println("你的年龄不大,这次放过你了");
		}
		
		
		
		
	}

}
