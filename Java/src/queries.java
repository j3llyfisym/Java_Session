import java.util.Arrays;
import java.util.Scanner;

public class queries {
    public static void main(String[] args) {
        int[][] queries = new int[10][3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("entr the array size");
        int n =Integer.parseInt(scanner.nextLine());
        int[] resultArray= new int[n];
        for (int i=0;i<n;i++){
            resultArray[i]=0;
        }
        System.out.println("enter the number of quires");
        int q= Integer.parseInt(scanner.nextLine());
        String[] line;
        for(int i=0;i<=q;i++){
            line = scanner.nextLine().split(",");
            queries[i][0] =Integer.parseInt(line[0]);
            queries[i][1] =Integer.parseInt(line[1]);
            queries[i][2] =Integer.parseInt(line[2]);
        }
        for(int i=0;i<q;i++) {
            for (i = queries[i][0]; i <= queries[i][1]; i++) {
                resultArray[i] += queries[i][2];
            }
        }
        System.out.println(Arrays.stream(resultArray).max().getAsInt());
        }}
