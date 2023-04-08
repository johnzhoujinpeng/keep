package code;
import java.util.Scanner;
 public class code90 {

	public static void main(String[]args) {
		
		
		
		int arr[]= {1,2,3};
		Scanner sc=new Scanner(System.in);
		
		while(true) {
		int arrnew[]=new int[arr.length+1];
		for(int i=0;i<arr.length;i++) {
			
			arrnew[i]=arr[i];	
		}
		System.out.println("请输入要添加的数字");
		int shu=sc.nextInt();
        arrnew[arrnew.length-1]=shu;
        arr=arrnew;
        for(int i=0;i<arr.length;i++) {
        	System.out.println(arr[i]);
        }
        System.out.println("添加成功,请选择是否继续?y/n");
        char choose=sc.next().charAt(0);
        if(choose=='n') {
        	System.out.println("退出程序");
        	break;
        }
        if(choose!='y') {
        	System.out.println("输入错误,请重新输入");
        }
}
		
	}
}
