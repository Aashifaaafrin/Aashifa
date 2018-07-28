import java.util.Scanner;

public class SwapBitWise {
	public static void main(String[] args) {
		int a,b;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		{
			a=a^b;
			b=a^b;
			a=b^a;
		}
		System.out.println(a+" "+b);
		
		
	}

}
