package src.programmers.고득점Kit.정렬;

import java.util.Arrays;

public class H_Index {
    public int solution(int[] citations) {
        int answer = 0;

        // 0 1 3 5 6 정렬
        Arrays.sort(citations);

        // n편중 h번 이상 인용된 눈문이 h편 이상일 때 h의 최대값은 H-Index
        int h;
        for (int i=0; i<citations.length; i++) {
            // i일때 가장 큰 h값 (논문 편 수)
            h = citations.length-i;

            // 논문 인용횟수가 h 이상인지 확인
            if (citations[i] >= h) {
                answer = h;
                break;
            }
        }
        return answer;
    }
}
