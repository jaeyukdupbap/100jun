import java.util.ArrayList;
import java.util.List;
public class List란 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        //요소 추가
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
//        fruits.add("apple");  중복된 요소 추가

        // 리스트 크기
        System.out.println("요소 개수: " + fruits.size());

        // 리스트 순회
        for (String fruit : fruits) {
            System.out.println(fruit + "!");
        }

        // 요소 접근
        System.out.println(fruits.get(0)); // apple 나올거임

        // 요소 위치
        System.out.println("banana 위치: " + fruits.indexOf("banana"));

        // 요소 제거
        fruits.remove("apple");
        System.out.println("apple 제거 후: " + fruits);

        // 모든 요소 제거
        fruits.clear();
        System.out.println("모든 요소 제거: " + fruits);
    }
}