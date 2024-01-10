import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            long N = sc.nextInt();
            long M = sc.nextInt();
            
            if (N<0&&M<0){
                if(N>M){
                    System.out.println((N-M));
                }
                else{
                    System.out.println(-(N-M));
                }
            }
            else if(N>=0&&M<0){
                System.out.println((N-M));
            }
            else if(N<0&&M>=0){
                System.out.println(-(N-M));
            }
            else if(N>=0&&M>=0){
                if(N>M){
                    System.out.println((N-M));
                }
                else{
                    System.out.println(-(N-M));
                }
            } 
        }
    }
}