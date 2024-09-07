import java.util.Scanner;
public class _10813 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] arr = new int[N+1];
        for (int i=1; i<=N; i++) {
            arr[i] = i;
        }

        for (int a=0; a<M; a++) {
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        for (int i=1; i<=N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}