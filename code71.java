package code;

import java.util.Scanner;
public class code71 {

	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		char answer=' ';
		do {
			System.out.println("老韩使出五连鞭");
			System.out.println("老韩问:还钱吗?y/n");
			
			 answer=sc.next().charAt(0);
			
			
		}while(answer!='y');
		
		System.out.println("终于还钱了");
		
		
	}
}
