package Assigmnet1;

public class Prog8_array_sum {
  public static void main(String[] args) {
	  // sum of array element
	   int [] arr = new int [] {1,2,3,4,5,};
	    int sum = 0;
	    for (int i = 0 ; i <arr.length ;i ++) {
	    	  sum = sum + arr[i];
	    }
	    System.out.println("sum of all elemnet of an array "+ sum );
	    
}
}
