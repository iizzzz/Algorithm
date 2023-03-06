package src.programmers.고득점Kit.stackqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class 같은숫자는싫어 {
    public int[] solution(int[] arr) {
        Stack<Integer> numbers = new Stack<>();
        Queue<Integer> store = new LinkedList<>();

        // arr의 첫 요소를 스택과 큐에 넣는다
        numbers.push(arr[0]);
        store.add(arr[0]);

        // 2번째 요소부터 첫번쨰 요소와 비교
        // peek()와 값이 다르면 Stack과 Queue에 값 저장 (중복 제거)
        for (int i = 1; i < arr.length; i++) {
            if (numbers.peek() == arr[i]) {
                continue;
            }
            numbers.push(arr[i]);
            store.add(arr[i]);
        }
        int[] answer = new int[store.size()];

        // Queue의 값들을 배열로 이동
        for (int i = 0; i < answer.length; i++) {
            answer[i] = store.peek();
            store.poll();
        }

        return answer;
    }
}
