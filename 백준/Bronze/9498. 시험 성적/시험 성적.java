import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            int x = sc.nextInt();
            int y;
            
            y=x/10;
            
            switch(y){
            case 10:
            	System.out.println("A");
            	break;
            case 9:
            	System.out.println("A");
            	break;
            case 8:
            	System.out.println("B");
            	break;
            case 7:
            	System.out.println("C");
            	break;
            case 6:
            	System.out.println("D");
            	break;
            default:
            	System.out.println("F");
            	break;
            }
            }
        }
    }