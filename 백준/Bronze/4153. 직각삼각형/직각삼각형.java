import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int MAX_SIZE =100; // Define the maximum number of sets
        long[][] X = new long[MAX_SIZE][3];

        // Input loop
        for (int i = 0; i < MAX_SIZE; i++) {
            for (int j = 0; j < 3; j++) {
                X[i][j] = sc.nextLong();
            }

            // Check for termination condition
            if (X[i][0] == 0 && X[i][1] == 0 && X[i][2] == 0) {
            	MAX_SIZE=i;
                break;
            }
        }

        // Processing loop
        for (int i = 0; i < MAX_SIZE; i++) {
            for (int j = 0; j < 2; j++) {
                if (X[i][j] > X[i][j + 1]) {
                    long temp = X[i][j];
                    X[i][j] = X[i][j + 1];
                    X[i][j + 1] = temp;
                }
            }

            // Check for right-angled triangle
            if (X[i][0] * X[i][0] + X[i][1] * X[i][1] == X[i][2] * X[i][2]) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}