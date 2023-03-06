package src.programmers.고득점Kit.stackqueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class 기능개발 {

    static int[] a = {93,30,55};
    static int[] b = {1,30,5};
    public static void main(String[] args) {
        solution(a,b);
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] answer = {};
        Queue<Integer> queue = new LinkedList<Integer>();

        // 몇일 후에 배포가 가능한지 계산
        // 아무리 빨리 끝나도 progresses 순서대로 배포가 가능하다고 해서 큐를 사용
        for (int i = 0; i < progresses.length; i++) {
            int count = 0;
            int j = progresses[i];

            // 93 + 1, 94 + 1
            while (true) {
                System.out.println("speed = " + speeds[i]);
                j += speeds[i];
                System.out.println("j = " + j);
                count++;
                // progresses + speed를 더한 값이 100이 될떄까지 돌면서
                // 개발에 걸리는 일수(count)를 ++하면서 그 값을 queue에 넣는다.
                if (j >= 100) {
                    queue.offer(count);
                    break;
                }
            }
        }
        // Queue = [7, 3, 9]
        System.out.println("queue = " + queue);

        // 배포 가능한 업무 카운트
        // 맨 앞에서부터 하나씩 꺼내서(poll) 비교 대상이 max보다 작으면 전부 배포 가능함
        while (!queue.isEmpty()) {
            int max = queue.poll(); // 7
            int count = 1; // 1

            // 큐에 마지막 하나남았을때까지 실행
            // 비교 대상이 max보다 더 작다면 전부 배포 가능하므로 카운트
            // 즉, max보다 값이 작으면 배포 가능한 기능의 수가 추가된다
            // max보다 높으면 기간이 더 걸린다는 것이므로 count가 1이 된다
            while (queue.size() > 0 && max >= queue.peek()) { // 2>0 && 7 >= 3
                queue.poll();
                count++;
            }
            list.add(count);
        }

        // arrayList -> 배열로 바꿈
        answer = new int[list.size()];
        for(int i=0;i<list.size();i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
}
