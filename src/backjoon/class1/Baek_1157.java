package src.backjoon.class1;

/* 1157 단어 공부 */

import java.io.*;
import java.util.*;

public class Baek_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 입력받을 문자열
        String a = br.readLine();
        // 문자열을 대문자로 변환
        a = a.toUpperCase();
        // 키 = character ,  횟수 = Integer 를 받는 해시맵 선언
        Map<Character, Integer> map = new HashMap<>();
        // 가장 많이 사용된 알파벳이 2개 이상이면 ? 을 출력할 리스트 선언
        List<Character> list = new ArrayList<>();
        // 많이 사용되면 카운트할 변수 선언
        int max = 0;


        for (int i=0; i<a.length(); i++) {
            char c = a.charAt(i);
            // 맵에 이미 c가 있으면 있으면 그 값+1, 없으면 1을 맵에 저장
            // c = a의 i번쨰 요소인 알파벳
            // 즉 동일 키 값이 있으면 값 덮어쓰기가 됨
            map.put(c, map.getOrDefault(c, 0) + 1);
            // 가장 많이 사용된 맵의 요소의 개수 max에 담기
            max = Math.max(max, map.get(c));
        }

        // 맵의 키,값을 돌면서
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            // value 값이 max와 같을때
            if (entry.getValue() == max) {
                // 알파벳이 가장 많이 사용 된 키를 리스트에 추가
                list.add(entry.getKey());
            }
        }

        if (list.size() > 1) {
            // 리스트에 1개 이상 존재하면 ? 출력
            bw.write("?");
        } else {
            // 리스트에 1개만 있으면 그 알파벳 출력
            bw.write(list.get(0));
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
