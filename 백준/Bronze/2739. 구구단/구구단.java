import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            int x = sc.nextInt();
            
            for(int i=1;i<=9;i++){
                System.out.printf("%d * %d = %d\n",x,i,x*i);
            }
        }
    }
}