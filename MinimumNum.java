import java.util.Arrays;
import java.util.Scanner;

public class MinimumNum {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n;
		   int a[]=new int[10];
           for(int i=0;i<10;i++)
        {
        	   a[i]=s.nextInt();
          }
                 Arrays.sort(a);
          System.out.print(a[0]);
        }
}
