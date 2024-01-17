import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		long A,B;
		Scanner sc = new Scanner(System.in);
		
		A = sc.nextLong();
		B = sc.nextLong();
		
		System.out.println(golbang(A,B));
		
	}
	public static long golbang(long A,Long B) {
		long C = (A+B)*(A-B);
		return C;
	}

}
