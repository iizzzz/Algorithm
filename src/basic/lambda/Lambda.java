package src.basic.lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Lambda {
    int method() {
        return (int) (Math.random()*5) +1;
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i=0; i<10; i++) {
            list.add(i);
        }

        // list의 모든 요소 출력, 한 문장이므로 {} 생략 가능
        list.forEach(i -> System.out.println(i + ", "));
        System.out.println();

        // list에서 2 or 3의 배수 제거
        list.removeIf(x -> x%2==0 || x%3==0);
        System.out.println(list);

        // list의 각 요소에 10을 곱한다
        list.replaceAll(i -> i*10);
        System.out.println(list);

        //------------------------------
        Map<String, String> map = new HashMap<>();
        map.put("1", "1");
        map.put("2", "2");
        map.put("3", "3");
        map.put("4", "4");

        // map의 모든 요소를 { k,v } 의 형식으로 출력한다
        map.forEach((k,v) -> System.out.println("{" + k + "," + v + "}"));
        System.out.println();
    }
}
