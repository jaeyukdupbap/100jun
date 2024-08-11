import java.util.HashMap; // HashMap은 요소의 순서를 보장하지 않음
import java.util.Map;
public class Map란 {
    public static void main(String[] args) {
        Map<String, Integer> ageMap = new HashMap<>(); // 요소의 순서를 보장해야 할 경우라면 LinkedHashMap을 사용하면 됨

        // 요소 추가
        ageMap.put("김민수", 18);
        ageMap.put("김수민", 20);
        ageMap.put("수민김", 22);

        // 요소 접근
        System.out.println("김민수의 나이는 : " + ageMap.get("김민수"));

        // 요소 수정
        ageMap.put("김민수", 25);

        // 요소 삭제
        ageMap.remove("수민김");

        // 요소 전체 출력 (1)  keySet()메서드를 사용한 것
        for (String key : ageMap.keySet()) {
            System.out.println(key + ": " + ageMap.get(key));
        }

        // 요소 전체 출력 (2) entrySet()을 사용한 것
        for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // 요소 존재 여부
        System.out.println("김수민" + (ageMap.containsKey("김수민")? " 존재" : " 존재하지 않음"));


        // Map 크기
        System.out.println("Map 크기 : " + ageMap.size());

        // Map 비우기
        ageMap.clear();
        System.out.println("Map 비움");
    }
}