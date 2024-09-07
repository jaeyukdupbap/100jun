import java.util.Scanner;
public class _2231 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 0;

        for (int i=1; i<n; i++) {
            int sum = i;
            int num = i;

            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }

            if (sum == n) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}