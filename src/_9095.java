import java.util.Scanner;
public class _9095 {
    public static void main(String[] args) {
        /* 0을 만드는 방법은 1가지임
           1을 만드는 방법은 1 > 1가지임
           2를 만드는 방법은 1+1, 2 > 2가지임
           3을 만드는 방법은 1+1+1, 2+1, 1+2, 3 > 4가지임
           4를 만드는 방법은 1+1+1+1, 2+1+1, 1+2+1, 1+1+2, 2+2, 1+3, 3+1 > 7가지임

           즉, n-1상황에서 1을 더해 n을 만드는 경우 모든 방법에 1을 더하면 n을 만들 수 있음
           예) n=4일 때, 3을 만드는 방법에 1을 다 더하면 4를 만들 수 있음 그래서 경우의 수는 4가지
           그러면 n-2상황에서 2를 더해도 n을 만들 수 있겠죠? 마찬가지로 1+1+2, 2+2 이렇게 되는거임 그래서 경우의 수는 2가지
           또한 1에서 3을 더하면 4가 만들어지니 1+3 1가지 경우밖에 없음 결과로는 4+2+1이 n=4일 때의 경우의 수임

           결론: 점화식 >>> a[n] = a[n-1] + a[n-2] + a[n-3]
        */
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for(int i=0; i<T; i++) {
            int n = scanner.nextInt();
            System.out.println(dp(n));
        }
    }
    public static int dp(int n) {
        if (n <= 1) return 1;
        if (n == 2) return 2;
        return dp(n-1) + dp(n-2) + dp(n-3);
    }
}