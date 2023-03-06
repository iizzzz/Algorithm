package src.programmers.고득점Kit.정렬;

import java.util.ArrayList;
import java.util.List;

public class 가장큰수 {

    static int[] A = {6, 10, 2};

    public static void main(String[] args) {
        solution(A);
    }

    public static String solution(int[] numbers) {
        String answer = "";
        List<String> list = new ArrayList<>();

        // 리스트에 배열의 요소를 넣어줌
        for (int num : numbers) {
            list.add(String.valueOf(num));
        }

        // 람다식을 이용한 정렬
         list.sort((o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        for (String s : list) {
            answer += s;
        }

        // 0,0,0 일때의 케이스도 고려한 삼항연산식
        return answer.charAt(0) == '0' ? "0" : answer;
    }
}
