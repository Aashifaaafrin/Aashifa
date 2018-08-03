import java.util.Scanner;
public class StringReverse {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String n=s.next();
		 StringBuilder s1= new StringBuilder(n);
         //s1.append(s1);
         s1=s1.reverse();
         s1.toString();
         System.out.println(s1);

    }

}
