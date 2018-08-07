import java.util.Scanner;

public class EvenOddPosition {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	String s1=s.nextLine();
	int len=s1.length();
	String s2="";
	String s3="";
	for(int i=0;i<len;i++) {
	if(i%2==0)
	{
	     s2=s2+s1.charAt(i);
	}
	else
	{
		s3=s3+s1.charAt(i);
	}
	}
	System.out.println(s2);
	System.out.println(s3);
}
}
