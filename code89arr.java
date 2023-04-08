package code;

public class code89arr {

	public static void main(String[]args) {
		
		int arr[]= {11,22,33,44,55,66};
//		int arr1[]=new int[arr.length];
//		for(int i=0;i<arr.length;i++) {
//			arr1[i]=arr[(arr.length-1)-i];
//			
//			System.out.println(arr1[i]);
			int temp=0;
			for(int i=0;i<arr.length/2;i++) {
				temp=arr[i];
			
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1]=temp;
			
			
			}
			
for(int i=0;i<arr.length;i++) {
	System.out.println(arr[i]);
	
}

		
		
		
		
	}
}
