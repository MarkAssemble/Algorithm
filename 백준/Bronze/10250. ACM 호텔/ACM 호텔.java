import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=1;i<=T;i++) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();
			
			String[][] X= new String[W][H];
			int F1, F2;
			
			for(int j=0;j<W;j++) {
				for(int k=0;k<H;k++) {
					if(j+1<10) {
						X[j][k] = Integer.toString(k+1)+Integer.toString(0)+Integer.toString(j+1);
						}
					else {
						X[j][k] = Integer.toString(k+1)+Integer.toString(j+1);
						}
				}
				 
			}
		
			if(N%H==0) {
				F1 = H;
				F2 = (N / H);
			}
			else {
				F1 = N % H ;
		        F2 = (N / H) + 1;
			}
			System.out.printf("%s\n",X[F2-1][F1-1]);
		}
		sc.close();
	}
}