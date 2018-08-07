import java.util.Scanner;

public class AppendString {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		StringBuilder sb=new StringBuilder(s.nextLine());
        sb.append(".");
        System.out.println(sb.toString());
	}
}
