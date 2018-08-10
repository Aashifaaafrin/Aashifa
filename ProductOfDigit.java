import java.util.Scanner;

public class ProductOfDigit {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int pro=1;
       while(n>0)
{
	      pro*=n%10;
	      n/=10;
}
      System.out.println(pro);
	}
}
