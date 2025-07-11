
import java.util.Scanner;

public class Fibrec {
    static long[] fibArray;

    public long fib(int n) {
        if (fibArray[n] == -1) {
            fibArray[n] = fib(n - 1) + fib(n - 2);
        }
        return fibArray[n];
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Fibrec x=new Fibrec();
        int n =scan.nextInt();
        fibArray=new long[n+1];
        for(int i=0;i<=n;i++)
            fibArray[i]=-1;
        fibArray[0]=0;
        fibArray[1]=1;
        System.out.printf("The number is %d\n", n);
        System.out.printf("The nth term is %d\n", x.fib(n));
        System.out.println(fibArray[0]);

        for (int i = 1; i <= n; i++)
            System.out.printf("%d\n", fibArray[i]);
    }
}