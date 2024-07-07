public class 피보나치_수열_by동적계획법 {
    public static void main(String[] args) {
        int n = 10;
        int[] fibonacci = new int[n+1];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i=2; i<=n; i++) {
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }
        for (int i=0; i<=n; i++)
        System.out.print(fibonacci[i] + " ");
    }
}