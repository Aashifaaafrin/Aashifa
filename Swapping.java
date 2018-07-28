import java.util.Scanner;

public class Swapping {
	public static void main(String[] args) {
		int a ,b,temp;
        Scanner s=new Scanner(System.in);
		 a=s.nextInt();
         b=s.nextInt();
		{
			temp=a;
			a=b;
			b=temp;
		}
		System.out.println(+a+" "+b);
		
	}

}
