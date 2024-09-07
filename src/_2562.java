import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class _2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] numbers = new int[9];
        int count = 1;

        for (int i = 0; i < 9; i++) {
            String[] input = br.readLine().split(" ");
            numbers[i] = Integer.parseInt(input[0]);
        }
        int max = numbers[0];

        for (int i = 0; i < 9; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
                count = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(count);
    }
}