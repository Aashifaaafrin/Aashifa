import java.util.Scanner;

public class PowerNum {
	public static void main(String[] args) {
int n,p,result=1;
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
n=s.nextInt();
System.out.println("enter the power value");
p=s.nextInt();

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

