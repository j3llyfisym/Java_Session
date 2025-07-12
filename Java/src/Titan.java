import java.util.Scanner;

public class Titan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-- > 0) {
            int D = scan.nextInt();
            int d = scan.nextInt();
            int A = scan.nextInt();
            int B = scan.nextInt();
            int C = scan.nextInt();

            int maxDistance = d * D;
            if (maxDistance >= 42) {
                System.out.println(C);
            } else if (maxDistance >= 21) {
                System.out.println(B);
            } else if (maxDistance >= 10) {
                System.out.println(A);
            }
            else {
                System.out.println(0);
            }
        }
        scan.close();
    }
}