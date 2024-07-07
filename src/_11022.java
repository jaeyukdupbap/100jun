import java.util.Scanner;
public class _11022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            if (A > 0 && A < 10 && B > 0 && B < 10) {
                System.out.printf("Case #%d: %d + %d = %d\n", i + 1, A, B, A + B);
            }
        }
    }
}