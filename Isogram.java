import java.util.Scanner;

public class Isogram {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String n=s.nextLine();
	int len=n.length();
	char ch[]=n.toCharArray();
	int x=0;
	for(int i=0;i<ch.length;i++)
	{
		for(int j=i+1;j<ch.length;j++)
		{
			if(ch[i]==ch[j])
			{ 
				x=1;
			}
			}
	}
		if(x==1)
		{
				System.out.println("no");
			}else
				System.out.println("yes");
		}
	}
