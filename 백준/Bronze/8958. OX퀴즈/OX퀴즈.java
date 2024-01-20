import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		String[] x = new String[T];
		int[] sum = new int[T];
		

		
		for(int i=0;i<T;i++) {
			x[i]=sc.next();
		}
		
		for(int j=0;j<T;j++) {	//String 배열 하나씩 체크
			
			int add=0;
			sum[j]=0;
			
			// k-1안의 값이 중점적으로 보는 값이기 때문에 마지막 값은 한번 더 판별해야 함.
			for(int k=0;k<x[j].length();k++) {	//String 배열안의 char 하나씩 체크
				
				
					// 전 char도 O이고, 현제 char도 O일때
					if(k>0&&x[j].charAt(k-1)=='O'&&x[j].charAt(k)=='O') {
						add++;
						
					}
					// 전 char는 O이고, 현제 char가 X일때, 시그마 함수 추가
					else if(k>0&&x[j].charAt(k-1)=='O'&&x[j].charAt(k)=='X'){	
						sum[j]=sum[j]+((add)*(add+1))/2;
						add=1;
					}
					else {
						add=1;
					}
					}
			// 마지막 char을 체크하고 O라면 시그마 함수 사용하기
			if(x[j].charAt(x[j].length()-1)=='O') {
				sum[j]=sum[j]+(add*(add+1))/2;
				}
			}
		for(int i=0;i<T;i++) {
			System.out.println(sum[i]);	//각각의 합 출력
		}
	}
}