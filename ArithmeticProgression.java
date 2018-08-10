import java.util.Scanner;

public class ArithmeticProgression {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int d=s.nextInt();
		int n=s.nextInt();
		int ap=(2*a+(n-1)*d);
		System.out.println(n/2*ap);
	}

}
