package code;
import java.util.Scanner;
public class code72 {
	
	
		
		public static void main(String[]args) {
			
			
			Scanner sc=new Scanner(System.in);
			int totalsum=0;int totalcount=0;
	for(int i=1;i<=3;i++) {		
		int sum=0;int count=0;
			for(int x=1;x<=5;x++) {
				System.out.println("请输入第"+i+"个班第"+x+"位学生的成绩");	
			int	grade=sc.nextInt();
	
			System.out.println("成绩为"+grade);
			sum+=grade;
				if(grade>=60) {
					System.out.println("该同学及格了");
					count++;}
					
				}
			System.out.println("该班级平均分为"+sum/5);
			System.out.println("及格人数为"+count);
		totalsum+=sum;
		totalcount+=count;
			}
	
	System.out.println("总平均分为"+totalsum/15);
	System.out.println("总及格人数为"+totalcount);
		}
		

				

			
			
			
		}
			
			
		

	



