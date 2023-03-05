package src.programmers.고득점Kit.Hash;

import java.util.HashMap;
import java.util.Map;

public class 위장 {
    static String[][] a = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};

    public static int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();
        String type;

        // 1. 들어온 데이터를 옷의 종류에 따라 HashMap으로 만들어준다.
        for (int i=0; i<clothes.length; i++) {
            type = clothes[i][1]; // 종류
            if (map.containsKey(type)) {
                map.put(type, map.get(type) + 1);
            } else {
                map.put(type, 1);
            }
        }

        // 2. map.size = 옷 타입의 개수
        // EntrySet으로 가져와서 각 Value (옷 타입의 개수)로 연산
        int result = 1;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            // 안입는 경우를 고려한 + 1
            result *= entry.getValue() + 1;
        }
        System.out.println(result-1);
        // 안입은 경우의 수를 빼주는 - 1
        return result - 1;
    }

    public static void main(String[] args) {
        solution(a);
    }
}
