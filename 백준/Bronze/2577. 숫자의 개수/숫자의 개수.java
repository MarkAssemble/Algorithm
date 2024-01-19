import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		sc.close();
		
		String D = Integer.toString(A*B*C);
		
		for (int i=0;i<10;i++) {
			int sum =0;
			for(int j=0;j<D.length();j++) {
				if(i==Character.getNumericValue(D.charAt(j))) {
					sum++;
				}
			}
			System.out.println(sum);
		}
	}
}