import java.util.Scanner;

public class Alphabet {
	public static void main(String[] args) {
		char ch;
		Scanner s=new Scanner(System.in);
		ch=s.next().charAt(0);
		if((ch>='a' && ch<='z') || (ch>='A'&&ch<='Z'))
				{
			System.out.println("Albhabet");
				}
		else 
		{
			System.out.println("No");
		}
		}
	}

		

