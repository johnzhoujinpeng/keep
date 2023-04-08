package code;

public class code75 {
	
	public static void main(String[]args) {
//		
//		for(int i=0;i<10;i++) {
//			
//			if(i==3) {
//				break;
//			}
//			System.out.println("i"+i);
//		} 
//		
		int sum=0;int i=1;
		for(;i<=100;i++) {
			sum+=i;
			if(sum>20) {
				break;
				
			}
		}
		System.out.println("当和大于20时i="+i);
		
	}

}
