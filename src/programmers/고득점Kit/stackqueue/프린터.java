package src.programmers.고득점Kit.stackqueue;

import java.util.LinkedList;
import java.util.Queue;

public class 프린터 {

    // 우선순위와 위치를 나타내는 클래스
    class Document {
        int priority = 0;
        int index = 0;

        public Document(int priority, int index) {
            this.priority = priority;
            this.index = index;
        }
    }

    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Document> queue = new LinkedList<>();
        for (int i=0; i<priorities.length; i++) {
            queue.add(new Document(priorities[i], i));
        }

        while (!queue.isEmpty()) {
            // 시작지점 설정
            int current = queue.peek().priority;
            boolean flag = false;

            // queue 요소들의 우선순위가 current보다 크다면 flag에 true저장
            for (Document doc : queue) {
                if (doc.priority > current) {
                    flag = true;
                    break;
                }
            }
            // flag가 true일때 앞의 것을 빼고 맨 뒤로 넣는다
            if (flag) {
                Document tempDoc = queue.poll();
                queue.add(tempDoc);
            // 우선순위가 뒤에것보다 높다면 answer를 증가시키고 출력물을 출력한다
            } else {
                answer++;
                Document doc = queue.poll();

                if (doc.index == location) {
                    return answer;
                }
            }
        }
        return answer;
    }
}
