import java.util.Scanner;

public class bitwise1 {
	static int isEven(int n)
    {   
		return (n & 1);
    }
    public static void main(String args[])
    {
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        if(isEven(n)==0)
            System.out.print("The above number is Even");
        else
            System.out.print("The above number is Odd");
    }
}

