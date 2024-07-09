import java.util.*;
public class _1339 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();

        String[] words = new String[N];
        for (int i = 0; i < N; i++) {
            words[i] = scanner.nextLine();
        }
        Map<Character, Integer> charWeight = new HashMap<>();

        for (String word : words) {
            int length = word.length();
            for (int i = 0; i < length; i++) {
                char c = word.charAt(i);
                int value = (int) Math.pow(10, length - i - 1);
                charWeight.put(c, charWeight.getOrDefault(c, 0) + value);
            }
        }

        List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(charWeight.entrySet());
        entryList.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        int number = 9;
        Map<Character, Integer> charToNumber = new HashMap<>();
        for (Map.Entry<Character, Integer> entry : entryList) {
            charToNumber.put(entry.getKey(), number--);
        }

        int sum = 0;
        for (String word : words) {
            int wordValue = 0;
            for (char c : word.toCharArray()) {
                wordValue = wordValue * 10 + charToNumber.get(c);
            }
            sum += wordValue;
        }

        System.out.println(sum);
    }
}