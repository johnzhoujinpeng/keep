package code;
import java.util.Scanner;
public class code91 {
	
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		int arr[]= {1,2,3,4,5};
		while(true) {
		int arrnew[]=new int[arr.length-1];
		for(int i=0;i<arr.length;i++) {
			if(i<=arr.length-2) {
			arrnew[i]=arr[i];
			
			}
		}
	
		arr=arrnew;
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("缩减成功,是否继续缩减?y/n");
		char choose=sc.next().charAt(0);
		if(arr.length==1) {
			System.out.println("不能再缩减");
			break;
		}
		if(choose=='n') {
			System.out.println("退出程序");
			break;
			
			
		}
		}
	}

}
