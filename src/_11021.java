import java.util.Scanner;
public class _11021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            System.out.printf("Case #%d: %d\n", i+1, A+B);
        }
    }
}