import java.util.Scanner;

public class SumOfAllNumbers {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int n1[]=new int[n];
		int sum=0;
		for(int i=0;i<n;i++)
		{
			n1[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			sum=sum+n1[i];
		}
		System.out.print(sum);
		}
	}
