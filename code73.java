package code;

public class code73 {

	public static void main(String[]args) {
		
	
			
		for(int i=1;i<=5;i++) {
			
			for(int k=1;k<=5-i;k++) {
				System.out.print(" ");
			}
			
			for(int x=1;x<=2*i-1;x++) {
				if(x==1||x==2*i-1||i==5) {
				System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
	
		System.out.println("");
		
	}
}
}  