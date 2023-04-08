package code;

public class code79 {

	public static void main(String[]args) {
		
		double []hens= {3,5,1,3.4,2,50,73,90};
		System.out.println("使用数组解决");
		double totalweight=0;
		for(int i=0;i<hens.length;i++) {
			totalweight+=hens[i];
			
		}
		System.out.println(totalweight+"+"+totalweight/hens.length);
		
		
		
	}
}
