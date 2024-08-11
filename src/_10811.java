import java.util.Scanner;
public class _10811 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n + 1];
        int tmp;
        for (int i = 1; i < n + 1; i++) {
            arr[i] = i;
        }

        for (int a = 0; a < m; a++) {
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            while (i < j) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        }
        for (int i = 1; i < n + 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}