import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String n=s.next();
		StringBuffer sb=new StringBuffer(n);
		sb.reverse();
		if(sb.toString().equals(n))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}

}
