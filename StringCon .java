import java.util.Scanner;

public class StringCon {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		String s2=s.next();
		if(s1.length()>s2.length()) 
		{
             System.out.println(s1);
        }
	 if(s1.length()<s2.length()) 
		{
			System.out.println(s2);
		}
	 else
	 {
		 System.out.println(s1);
	 }
		
	}

}
