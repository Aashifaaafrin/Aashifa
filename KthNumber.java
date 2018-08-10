import java.util.Scanner;

public class KthNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int n1[]=new int[n];
		for(int i=0;i<n;i++)
		{
			n1[i]=s.nextInt();
		}
		System.out.println(n1[m-1]);
		
	}

}
