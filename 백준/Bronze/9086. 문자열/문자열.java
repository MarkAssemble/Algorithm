import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String[] A = new String[T];
        
        for(int i=0;i<T;i++) {
        	String B=sc.next();
        	A[i] = String.valueOf(B.charAt(0)) + String.valueOf(B.charAt(B.length() - 1)); 
        	
        }
        for(int i=0;i<T;i++) {
        	System.out.printf("%s\n",A[i]);
        	
        }
        
        sc.close();
    }
}