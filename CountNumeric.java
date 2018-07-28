import java.util.Scanner;

public class CountNumeric {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String n=s.nextLine();
        int count=0;
		    for (int i=0;i<n.length();i++) 
		    {
		        if (Character.isDigit(n.charAt(i))) 
		        {
		            count++;
		        }
		    }
		    System.out.print(count);
		   
		}
}
