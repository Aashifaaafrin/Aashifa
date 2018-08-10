import java.util.Scanner;

public class ModOperator {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int p=s.nextInt();
		int n1=(n*m)%p;
		System.out.println(n1);
	}

}
