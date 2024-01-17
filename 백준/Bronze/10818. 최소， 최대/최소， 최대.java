import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		int[] x =new int[N];
		
		for(int i=0;i<N;i++) {
			x[i]=sc.nextInt();
		}
		for(int j=0;j<N;j++) {
			
			if(max<x[j]) {
				max=x[j];
			}
			if(min>x[j]) {
				min=x[j];
			}
		}
		System.out.printf("%d %d",min,max);
	}
}
