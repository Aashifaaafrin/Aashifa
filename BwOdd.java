import java.util.Scanner;

public class BwOdd {
	public static void main(String[] args) {
		int m,n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		m=s.nextInt();
		int a=n+1;
		for(int i=a;i<m;i++){
		if(i%2!=0)
			System.out.println(i+"  ");

		}


	}

}


