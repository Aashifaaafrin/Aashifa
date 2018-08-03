import java.util.Scanner;

public class HourMinSub {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int h1=s.nextInt();
        int m1=s.nextInt();
        int h2=s.nextInt();
        int m2=s.nextInt();
        int finalHour=Math.abs(((h1*60)+m1)-((h2*60)+m2));
        System.out.println(finalHour/60+" "+(finalHour%60));
	}
}
