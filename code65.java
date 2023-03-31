package code;

public class code65 {
	
	public static void main(String[]args) {
		
		
	
		int sum=0;
		int count=0;
	
	int start=24;
	int end=200;
	int t=11;
		
		for(int x=start;x<end;x++) {
			
			
			if(x%t==0) {
				
				System.out.println(x);
				count++;
				sum+=x;
			
					}
			
		}
		
		System.out.println(sum);
		System.out.println(count);
		
		
	}

}
