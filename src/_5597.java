import java.util.Scanner;
public class _5597 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[] arr = new boolean[31];

        for (int i=0; i<28; i++) {
            int student = scanner.nextInt();
            arr[student] = true;
        }

        for (int i=1; i<arr.length; i++) {
            if (!arr[i]) {
                System.out.print(i + " ");
            }
        }
    }
}