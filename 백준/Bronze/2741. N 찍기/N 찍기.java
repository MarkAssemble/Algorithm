import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            int x = sc.nextInt();
            
            for(int i=1;i<=x;i++){
                System.out.println(i);
            }
        }
    }
}