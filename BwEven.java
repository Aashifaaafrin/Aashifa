import java.util.Scanner;

public class BwEven {
	public static void main(String[] args) {
		
		int m,n,i;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		m=s.nextInt();
		int a=n+1;
		for(i=a;i<m;i++){
		if(i%2==0)
			System.out.println(i);

		}


	}

}
