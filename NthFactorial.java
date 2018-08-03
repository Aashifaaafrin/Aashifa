import java.util.Scanner;

public class NthFactorial {
	public static void main(String[] args) {
		int i,fact=1;  
        int n;  
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(i=1;i<=n;i++){    
        fact=fact*i;    
}    
      System.out.println(+fact);
	}
}
