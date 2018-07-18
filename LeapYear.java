import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the year");
		n=s.nextInt();
		if(n%4==0)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		
	}

}
