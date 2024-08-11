import java.util.Scanner;
public class _15969 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        for(int i=0; i<N; i++) {
            arr[i] = scanner.nextInt();
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        System.out.println(max-min);
    }
}