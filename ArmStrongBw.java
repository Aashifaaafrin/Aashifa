import java.util.Scanner;

public class ArmStrongBw {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		 int n1=s.nextInt();
		 int a, b,sum=0;
	        for(int i =n; i<=n1;i++)
	        {
	        	
	            n = i;
	            while(n > 0)
	            {
	                b = n % 10;
	                sum = sum + (b * b * b);
	                n = n / 10;
	            }
	            if(sum == i)
	            {
	                System.out.print(i+" ");
	            }
	           sum = 0;
	        }
	}
}
