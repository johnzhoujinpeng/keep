package code;

public class code92 {

	public static void main(String[]args) {
		
		int arr[]= {24,69,80,57,13};
		int temp=0;
		
		
		for(int x=0;x<4;x++) {
		for(int i=0;i<4-x;i++) {
			
			if(arr[i]>arr[i+1]) {
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
			
			
		}
		System.out.println("第"+x+1+"轮==");
		
		
		for(int k=0;k<5;k++) {
		
		System.out.println(arr[k]);
		}
		}
	}
}
