package code;

public class code78 {
	
	public static void main(String[]args) {
		
		int total=100000;
		int count1=0;
		int count2=0;
	
		
			while(total>50000) {
				total-=total*0.05;
				count1++;
			}
			System.out.println(count1);
			while(total<=50000) {
				total-=1000;
				count2++;
			if(total<1000) {
				break;
			}
			}	
			System.out.println(count2);
			
			System.out.println(count1+count2);
		
		}
		
	
	}


