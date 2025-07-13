import java.util.Scanner;

public class Weights {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();
            int wM = sc.nextInt();
            int wR = sc.nextInt();

            int MAX_WEIGHT = 100001;
            int[] weights = new int[N];
            for (int i = 0; i < N; i++) {
                int w = sc.nextInt();
                weights[i] = w;
            }

            int[] freq = new int[MAX_WEIGHT];
            for (int i = 1; i < N; i++) {
                freq[weights[i]]++;
            }

            int total = 0;
            total += wR;

            for (int i = 0; i < MAX_WEIGHT; i++) {
                int pairs = freq[i] / 2;
                total += pairs * i * 2;
            }

            if (total >= wM) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
