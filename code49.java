package code;

public class code49 {
	
	public static void main(String[]args) {
		
		int a=10;
		int b=99;
		int result=a>b?a++:b--;
		System.out.println(result);
		
		int result1=a<b?a++:b--;
		System.out.println("result1="+result1);
		System.out.println("a="+a);
		System.out.println("b="+b);
		
	}

}
