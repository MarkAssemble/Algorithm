import java.util.Scanner;

public class Main{
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int A = sc.nextInt();
            
            int[] x = new int[N];
            
            for(int j=0;j<N;j++) {
            	x[j] = sc.nextInt();
            }
            for (int i=0;i<N;i++) {
            	if (x[i]<A) {
            		System.out.printf("%d ",x[i]);
            	}
            }
            
            
    }
}