package array1;

public class array1 {
	
    public static void main(String args[]) {
	
       int arr[] = {10,20,30,40,50};
       int key = 20;
       int pos=0;
       
       for(int i=0; i<arr.length; i++) {
       pos++;
       
       if(arr[i]==key) {
    	   
       System.out.print("Element found at position "+pos);
      }
    }
  }
}
