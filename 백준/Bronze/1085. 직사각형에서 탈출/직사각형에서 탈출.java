import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input coordinates (x, y) and rectangle dimensions (w, h)
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        
        // Calculate minimum distance to the boundary of the rectangle
        int distance;

        // Check if the point is closer to the vertical boundary
        if (w - x <= x) {
            distance = w - x;
        } else {
            distance = x;
        }

        // Check if the point is closer to the horizontal boundary
        if (h - y <= y && h - y < distance) {
            distance = h - y;
        } else if (y < distance) {
            distance = y;
        }

        // Output the minimum distance
        System.out.println(distance);
    }
}