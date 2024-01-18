import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i=1;i<=T;i++) {
			int R = sc.nextInt();
			String S = sc.next();
			
			for(int k=0;k<S.length();k++) {
				for(int j=1;j<=R;j++) {
					System.out.print(S.charAt(k));
				}
			}
			System.out.println();
		}
		sc.close();
	}
}