package code;

public class code88 {

public static void main(String[]args) {
	
	
	int arr1[]= {3,4,5};
	int arr2[]=new int[arr1.length];
	for(int i=0;i<arr1.length;i++) {
		arr2[i]=arr1[i];
		System.out.println(arr2[i]);
	}
	
	arr2[0]=10;
	
	for(int i=0;i<arr1.length;i++) {
		System.out.println(arr1[i]);
	}
	for(int i=0;i<arr1.length;i++) {
		System.out.println(arr2[i]);
	}
	
}
}
