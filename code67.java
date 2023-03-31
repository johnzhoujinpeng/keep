package code;

public class code67 {

	public static void main(String[]args) {
		
//		int i=1;
//		while(i<=10) {
//			System.out.println("韩顺平教育"+i);
//			i++;
//		}
//		
//		System.out.println("退出while,程序继续");
		
		int i=1;
		int count=0;
		int sum=0;
		while(i<=100){
			
			i++;
			if(i%3==0) {
				System.out.println(i);	
				count++;
				sum+=i;
				
			}
			
			
			
			
		}
		System.out.println(sum);
		System.out.println(count);
	}
}
