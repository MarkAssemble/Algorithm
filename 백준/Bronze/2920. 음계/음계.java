import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] A = new int[8];
		int[] x = new int[8];
		
		int assum=0;
		int dessum=0;
		
		for (int i=0;i<8;i++) {
			A[i] = sc.nextInt();
		}
		sc.close();
		for(int j=1;j<9;j++) {
			
			if(A[j-1]==j) {
				x[j-1]=1;
			}
			else if(A[j-1]==9-j){
				x[j-1]=0;
			}
			else {
				x[j-1]=-1;
			}			
		}
		for(int k=0;k<8;k++) {
			
			if(x[k]==1) {
				assum++;
			}
			else if(x[k]==0) {
				dessum++;
			}
		}
		if(assum==8) {
			System.out.println("ascending");
		}
		else if(dessum==8) {
			System.out.println("descending");
		}
		else {
			System.out.println("mixed");
		}
	}
}