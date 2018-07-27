import java.util.Scanner;

public class Index {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m[]=new int[n];
		int ind[]=new int[m.length];
		for(int i=0;i<m.length;i++) {
			m[i]=s.nextInt();
		}
			for(int i=0;i<m.length;i++) {
				System.out.println(m[i]+" "+i);
			}
	}
}
		
