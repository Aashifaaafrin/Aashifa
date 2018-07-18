import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		int a;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		a=s.nextInt();
		if(a%2==0)
		{
			System.out.println("the given num is even");
		}
		else if(a%2!=0)
		{
			System.out.println("the given num is odd");
		}
		else
		{
			System.out.println("the number is invalid");
		}
	}

}
