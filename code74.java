package code;

public class code74 {

	
	    public static void main(String[] args) {
	int total=10;
	        for (int i = 1; i<= total; i++) {
	            for (int k = 1; k <= i - 1; k++) {
	                System.out.print(" ");
	            }

	            for (int x = total; x >= 2 * i - total; x--) {

	                if (i==1||x==total-2||x==2*i-total+2){

	                    System.out.print("*");
	                }else {
	                    System.out.print(" ");
	                }

	            }
	            System.out.println("");
	        }


	    }
	}


