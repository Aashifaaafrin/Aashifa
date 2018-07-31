import java.util.Scanner;

public class NthFibonacci {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a =1;
		int b = 1;
		int c = 0;
       System.out.print(a+" "+b);
		for(int i=1;i<=n-2;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(" "+c);

		}
	}

}
