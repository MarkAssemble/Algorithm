import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] x = new int[9];
		int max=x[0], maxIndex=0;
		
		for(int i=0;i<9;i++) {
			x[i] = sc.nextInt();
		}
		
		for(int i=0;i<9;i++) {
				
			if (x[i]>max) {
				max=x[i];
				maxIndex=i+1;
			}
		}
		System.out.println(max);
		System.out.print(maxIndex);
	}
}
