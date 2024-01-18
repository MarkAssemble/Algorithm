import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String A = sc.nextLine();
		
		int sum=0;
		for(int i=0;i<A.length();i++) {
			
			char x = A.charAt(i);
			
			if (x==' ') {
				sum+=1;
			}
			
		}
		char y = A.charAt(0);
		char z = A.charAt(A.length()-1);
		if (y==' ') {
			sum-=1;
		}
		if (z==' ') {
			sum-=1;
		}
		
		System.out.println(sum+1);
	}

}