package code;
import java.util.Scanner;
public class code85 {
	
	public static void main(String[]args) {
		
		double score[]=new double[10];
		for(int i=0;i<score.length;i++) {
			System.out.println("请输入第"+i+1+"个成绩");
			Scanner sc=new Scanner(System.in);
			score[i]=sc.nextDouble();
		}
		for(int i=0;i<score.length;i++) {
			System.out.println("第"+i+1+"个的成绩为"+score[i]);
		}
		
		
	}

}
