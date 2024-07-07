import java.util.Scanner;
public class _10951 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a > 0 && a < 10 && b > 0 && b < 10) {
                System.out.println(a + b);
            }
            else {
                break;
            }
        }
        scanner.close();
    }
}