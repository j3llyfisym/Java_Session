import java.util.Scanner;

public class ToW {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int winners = 0;
        int losers = 0;
        for (int i = 0; i < n; i++) {
            int li = scan.nextInt();
            int ri = scan.nextInt();

            winners += li;
            losers += ri;
        }
        if (winners > losers) {
            System.out.println("WIN");
        } else if (winners < losers) {
            System.out.println("LOSE");
        } else {
            System.out.println("TIE");
        }
        scan.close();
    }
}