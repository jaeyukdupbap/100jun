import java.util.Scanner;
public class _10870 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fibo(n));
    }
    public static int fibo(int n) {
        if(n==0) return 0;
        if(n==1) return 1;

        return fibo(n-1) + fibo(n-2);
    }
}