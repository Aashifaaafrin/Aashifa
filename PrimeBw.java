import java.util.Scanner;

public class PrimeBw {
	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);  
    System.out.print("Enter the first number : ");  
    int start = s.nextInt();  
    System.out.print("Enter the second number : ");  
    int end = s.nextInt();  
    System.out.println("List of prime numbers between " + start + " and " + end);  
    for (int i = start; i <= end; i++) {  
    if (i%2!=0) {  
        System.out.println(i);
    }
}

	}
}




