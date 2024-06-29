import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		String SA = Integer.toString(A);
		String SB = Integer.toString(B);
		String SS = SA+SB;
		int SAB = Integer.parseInt(SS);
		
		System.out.printf("%d\n",A+B-C);
		System.out.printf("%d\n",SAB-C);
	}
	
	
}
