import java.util.Scanner;
public class _1003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] fibonacci = new int[41];

        int T = scanner.nextInt();
        int[] n = new int[T];

        for(int i=0; i<T; i++) {
            n[i] = scanner.nextInt();
        }
        }
    public static int fibo(int n, int[] fibonacci) {
        if (n==0) return 0;
        if (n==1) return 1;
        if(fibonacci[n]!=0) return fibonacci[n];
        return fibo(n-1, fibonacci) + fibo(n-2, fibonacci);
    }
}