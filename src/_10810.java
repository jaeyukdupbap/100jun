import java.util.Scanner;
public class _10810 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n+1];

        for (int a=0; a<m; a++) {
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            int k = scanner.nextInt();

            for (int b=i; b<=j; b++) {
                arr[b] = k;
            }
        }
        for (int i=1; i<=n; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}