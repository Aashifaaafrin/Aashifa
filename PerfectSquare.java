import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int m=s.nextInt();
    int p=m*n;
	if(Math.sqrt(p)-Math.floor(Math.sqrt(p))==0)
	{
          System.out.println("yes");
	}
	else
	{
		System.out.println("no");
	}
	}
}
