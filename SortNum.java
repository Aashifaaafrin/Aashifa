import java.util.Arrays;
import java.util.Scanner;

public class SortNum {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();	
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			 a[i]=s.nextInt();
		}
		Arrays.sort(a);
	for(int j=0;j<n;j++)
	{
		System.out.print(a[j]+" ");
}
	}
}
