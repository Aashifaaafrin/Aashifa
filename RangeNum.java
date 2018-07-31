import java.util.Scanner;

public class RangeNum {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n>=1 && n<=10)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}

}
