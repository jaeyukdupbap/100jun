import java.util.Scanner;
public class _3052 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[] arr = new boolean[42];
        int count = 0;

        for (int i=0; i<10; i++) {
            int n = scanner.nextInt();
            if (n <= 1000 && n > 0) {
                int num = n % 42;
                if (!arr[num]) {
                    arr[num] = true;
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}