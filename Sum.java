import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
         int m=s.nextInt();
		int sum=0;
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int j=0;j<n;j++)
		{
			sum=sum+a[j];
		}
		System.out.println(sum);
	}

}
