import java.util.Scanner;

public class Numeric {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String n=s.nextLine();
		String s1="[0-9]+.[0-9]";
		if(n.matches(s1))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
