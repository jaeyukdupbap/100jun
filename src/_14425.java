import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class _14425 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine();

        Map<String, Boolean> map = new HashMap<>();

        for(int i=0; i<N; i++) {
            String str = scanner.nextLine();
            map.put(str, true);
        }

        int count = 0;

        for(int i=0; i<M; i++) {
            String str = scanner.nextLine();
            if (map.containsKey(str)) {
                count++;
            }
        }
        System.out.println(count);
        scanner.close();
    }
}