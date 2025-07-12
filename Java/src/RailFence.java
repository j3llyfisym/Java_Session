import java.util.Scanner;

public class RailFence {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String STR = scan.nextLine().trim();

        StringBuilder r0 = new StringBuilder();
        StringBuilder r1 = new StringBuilder();
        StringBuilder r2 = new StringBuilder();

        int n = STR.length();
        int i = 0;

        while (i < n) {
            if (i < n) {
                r0.append(STR.charAt(i));
                i++;
            }
            if (i < n) {
                r1.append(STR.charAt(i));
                i++;
            }
            if (i < n) {
                r2.append(STR.charAt(i));
                i++;
            }
            if (i < n) {
                r1.append(STR.charAt(i));
                i++;
            }
        }
        String result = r0.toString() + r1.toString() + r2.toString();
        System.out.println(result);
    }
}