package Assigmnet1;

public class Prog20_reverse_arraylist {
	public static void main(String[] args) {
		 int [] arr =new int [] {1,2,3,4,5};
		 System.out.println(" original array :");
		 for ( int i =0 ; i<arr.length ;i++) {
			 System.out.print(arr[i]+ " ");
			 
		 }
		 System.out.println();
		 System.out.println(" reverse arry :");
		 for (int i =arr.length-1;i>=0;i--) {
			 System.out.print(arr[i]+" ");
		 }
	}
	

}
