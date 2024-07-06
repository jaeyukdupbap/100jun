import java.util.Arrays;
import java.util.Scanner;

public class _28417 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] scores = new int[N][7];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 7; j++) {
                scores[i][j] = scanner.nextInt();
            }
        }
        int maxTotalScore = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            int runMax = Math.max(scores[i][0], scores[i][1]);
            int[] tricks = {scores[i][2], scores[i][3], scores[i][4], scores[i][5], scores[i][6]};
            Arrays.sort(tricks);
            int sumTopTwo = tricks[4] + tricks[3];
            int totalScore = runMax + sumTopTwo;
            if (totalScore > maxTotalScore) {
                maxTotalScore = totalScore;
            }
        }
        System.out.println(maxTotalScore);
        scanner.close();
    }
}