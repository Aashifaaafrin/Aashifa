import java.util.Scanner;

public class AlphanumericString {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String n=s.next();
		String m="";
		for(int i=0;i<n.length();i++)
		{
			if(Character.isDigit(n.charAt(i)))
			{
				m+=n.charAt(i);
			}
		}
		System.out.println(m);
		
	}

}
