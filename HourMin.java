import java.util.Scanner;

public class HourMin {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int hour=n/60;
		int min=n%60;
		System.out.println(hour+ " " +min);
	}

}
