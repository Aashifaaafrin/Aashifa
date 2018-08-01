import java.util.Scanner;

public class AllDigit {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
	    String m=Integer.toString(n);
	    for(int i=0;i<m.length();i++){	
		System.out.print(" "+m.charAt(i));
		}
	}
}
