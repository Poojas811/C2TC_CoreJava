package array_1;
import java.util.Scanner;

public class array_1 {
	
	public static void main(String args[]){
		int arr[];
		int key,n=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array : ");
		n=sc.nextInt();
		arr=new int[n];
		System.out.println("Enter the elements");
		for(int j=0;j<n;j++) {
			arr[j]=sc.nextInt();
		}
		System.out.println("Enter the element to be searched");
		key=sc.nextInt();
		int pos=0;
		for(int i=0; i<arr.length; i++) {
			pos++;
			if(arr[i]==key) {
				System.out.print("Element found at position "+pos);
			}
		}
	}
}
