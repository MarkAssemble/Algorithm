
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int A,B;
		Scanner sc = new Scanner(System.in);
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		System.out.println(golbang(A,B));
		
	}
	public static long golbang(int A,int B) {
		long C = (A+B)*(A-B);
		return C;
	}

}
