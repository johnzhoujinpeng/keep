package code;

public class code21 {
	public static void main(String[]args) {
		float num2=1.1F;
		double num3=1.1;
		double num4=1.1f;
		
		double num5=0.123;
		System.out.println(num5);
		System.out.println(5.12e2);
		System.out.println(5.12E-2);
		double num9=2.1234567851;
		float num10=2.1234567851F;
		System.out.println(num9);
		
		System.out.println(num10);
		
		double num11=2.7;
		double num12=8.1/3;
		System.out.println(num11);
		System.out.println(num12);
		
		if(num11==num12) {
			System.out.println("相等");
			if(Math.abs(num11-num12)<0.000001){
				System.out.println("差值非常小,到我们规定的精度,认为相等");
			}
			
		}
		
		System.out.println(Math.abs(num11-num12));
		
		
	}

}
