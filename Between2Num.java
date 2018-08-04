import java.util.Scanner;

public class Between2Num {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int p=s.nextInt();
		if(n>m &&n<p)
		{
			System.out.println("yes");
		}
		else {
		System.out.println("no");
	}
	}
}
