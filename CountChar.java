import java.util.Scanner;

public class CountChar {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String n=s.nextLine();
		String m[]=n.split("\\s");
		int sum=0;
		for(int i=0;i<m.length;i++)
		{
			int n1=m[i].length();
			sum=sum+n1;
		}
		
		System.out.println(sum);

	}

}
