import java.util.Scanner;
public class _1110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        int realN = N;
        int cycle = 0;

        int first = N / 10;
        int second = N % 10;
        int sum = first+second;
        N = second*10 + sum % 10;
        cycle++;

        while (N != realN) {
            first = N / 10;
            second = N % 10;
            sum = first+second;
            N = second*10 + sum % 10;
            cycle++;
        }
        System.out.println(cycle);
    }
}