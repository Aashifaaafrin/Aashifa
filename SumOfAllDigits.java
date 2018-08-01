import java.util.Scanner;

public class SumOfAllDigits {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum = 0;
		while(n!=0)
		{
			int a=n%10;
			sum=sum+a;
			n=n/10;
		}
		System.out.println(sum);
	}

}
