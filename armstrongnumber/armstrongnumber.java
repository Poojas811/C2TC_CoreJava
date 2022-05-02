import java.util.*;


public class armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n,sum=0,r,m,count=0;
		System.out.println("enter the number");
		n=s.nextInt();
		m=n;
		while(n>0)
		{
			r=n%10;
			sum=sum+r*r*r;
			n=n/10;
			count++;
			//System.out.println(r);
		}
		System.out.println("its a "+count+" digit number");
		if(m==sum) {
			System.out.println("and its an ARMSTRONG NUMBER ");
			
		}
		else {
			System.out.println("and its not an armstrong number");
		}
	}

}