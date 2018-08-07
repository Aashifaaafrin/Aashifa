import java.util.Scanner;

public class MiddleElement {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String n=s.next();
		int len=n.length();
		if(len%2==0)
		{
			System.out.print(n.substring(0, len/2-1)+"**"+n.substring(len/2+1,len));
		}else
		System.out.print(n.substring(0, len/2)+"*"+n.substring(len/2+1,len));
	}
}

