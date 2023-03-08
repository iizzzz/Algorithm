package src.programmers.고득점Kit.완전탐색;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class 모의고사 {
    static int[] testA = {1,2,3,4,5};
    static int[] testB = {2,1,2,3,2,4,2,5};
    static int[] testC = {3,3,1,1,2,2,4,4,5,5};

    static int[] answer = {1,2,3,4,5};

    public static void main(String[] args) {
        solution(answer);
    }

    public static int[] solution(int[] answers) {
        int[] score = new int[3];

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 0);
        map.put(2, 0);
        map.put(3, 0);

        // 정답 갯수 Count, Key(학생번호):Value(정답개수) 설정
        for (int i = 0; i < answers.length; i++) {
            int num = answers[i];
            if (testA[i%5] == num) map.replace(1, map.get(1)+1);
            if (testB[i%8] == num) map.replace(2, map.get(2)+1);
            if (testC[i%10] == num) map.replace(3, map.get(3)+1);
        }
        // HashMap의 Value를 돌면서 최대 값 구하기
        int max = map.get(1);
        for (Integer val : map.values()) {
            if (val > max) {
                max = val;
            }
        }
        // 최대값과 일치하는 Key를 정답 리스트에 저장
        ArrayList<Integer> answerList = new ArrayList<>();
        for (Integer key : map.keySet()) {
            if (map.get(key) == max) {
                answerList.add(key);
            }
        }

        // 오름차순 정렬 및 배열로 변환후 반환
        int[] answer = new int[answerList.size()];
        Collections.sort(answerList);
        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
