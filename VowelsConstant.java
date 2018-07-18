import java.util.Scanner;

public class VowelsConstant {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the character");
	    char ch=s.next().charAt(0);
		if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println("vowel");
		}
		else
		{
			System.out.println("constant");
		}
		
		
	}

}
