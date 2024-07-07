import java.util.Scanner;
public class _18108 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        if(y >= 1000 && y <= 3000) {
            System.out.println(y - 543);
        }
    }
}