import java.util.Scanner;
public class _27866 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int i = scanner.nextInt();
        if (i > 0 && i <= S.length()) {
            System.out.println(S.charAt(i-1));
        }
        scanner.close();
    }
}