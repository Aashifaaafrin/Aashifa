import java.util.Scanner;
public class powerOfTwoNum {
	public static void main(String[] args) {
		int result=1;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the two numbers:");
		 int n=s.nextInt();
		 int p=s.nextInt();
		    if(n>=0&&p==0)
		     {
		        result=1;
		     }
		    else if(n==0&&p>=1)
		      { 
		         result=0;
		      }
		    else
		     {
		         for(int i=1;i<=p;i++)
			 {
		            result=result*n;
		 	 }	    
		     }
		    System.out.println(n+"^"+p+"="+result);
			
		  }
		}
