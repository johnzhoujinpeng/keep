package code;

public class code87 {
	
	public static void main(String[]args) {
		
		int arr[]= {4,-1,9,10,23};

		int max=arr[0];
		int maxindex=0;
      for(int i=0;i<arr.length;i++) {
	if(max<arr[i]) {
		max=arr[i];
		maxindex=i;
		
	}
}		
		System.out.println(max+"+"+maxindex);
		
	}

}
