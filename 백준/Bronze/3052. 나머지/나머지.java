import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		
		int[] y = new int [10];
		for(int i=0;i<10;i++) {
			int x = sc.nextInt();
			
			y[i]=x%42;
		}
		sc.close();
		
		//인덱스마다 차례대로 판별하는데, 서로다른 인덱스 값이 같을 시 뒤의 인덱스 값을 -1로 수정
		for(int j=1;j<y.length;j++) {
			for(int k=0;k<j;k++) {
				if(y[j]==y[k]) {
					y[k]=-1;
				}
			}
		}
		
		//각각의 인덱스 값이 -1이 아니라면 sum에 +1을 해줌
		for(int w=0;w<y.length;w++) {
			if(y[w]!=-1) {
				sum++;
			}
		}
		System.out.println(sum);
	}
}