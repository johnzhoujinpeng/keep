package code;

public class code43 {
	
	public static void main(String[]args) {
		
		int age=50;
		
		if (age>20||age<30) {
			System.out.println("ok100");
			
		}
		if(age>20|age<30) {
			System.out.println("ok200");
			
		}
		
		
		int a=4;
		int b=9;
		if(++b>10|++a>3) {
			System.out.println("ok300");
			
			
		}
		
		
		System.out.println("a="+a+"b="+b);
		
	}

}
