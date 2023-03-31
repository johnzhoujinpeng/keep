package code;

import java.util.Scanner;
public class code62 {
	
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个成绩");
		int grade=sc.nextInt();
		if(grade>=0&&grade<=100) {
		
		switch((int)(grade/60)) {
		
		case 1:
			System.out.println("合格");
			break;
		case 0:
			System.out.println("不合格");
			
			break;
			
			default:
				System.out.println("输入错误");
		
		
		}

		}
	}

}
