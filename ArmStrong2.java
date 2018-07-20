import java.util.Scanner;

public class ArmStrong {
	public static void main(String[] args) {
		int a;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
        int c=0;  
		    int n=a;  
		    while(n>0)  
		    {  
		    c+=(n%10)*(n%10)*(n%10); 
		    //System.out.println(n%10);
		    n/=10;
		    }  
		    if(a==c)  
		    System.out.println("yes");   
		    else  
		        System.out.println("No");   
	}
}
