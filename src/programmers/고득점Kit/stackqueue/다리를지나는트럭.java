package src.programmers.고득점Kit.stackqueue;

import java.util.LinkedList;
import java.util.Queue;

public class 다리를지나는트럭 {

    public static void main(String[] args) {
        int[] n = {7, 4, 5, 6};
        System.out.println(solution(2, 10, n));
        System.out.println(solution2(2,10,n));
    }

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> queue = new LinkedList<Integer>();
        int time=0, sum=0;

        for (int i = 0; i < truck_weights.length; i++) {
            int truck = truck_weights[i];

            while (true) {
                // 큐가 비어있을 경우 다리를 건너게 한다
                if (queue.isEmpty()) {
                    queue.add(truck);
                    sum += truck; // 트럭 무게의 합을 구한다.
                    time++; // 다리에 건너는 행동을 했으므로 시간 +1
                    break;
                    // 트럭의 수가 length와 같기 떄문에 트럭이 다리를 다 지나서 다리에서 빠져나와야 한다.
                } else if (queue.size() == bridge_length) {
                    sum -= queue.poll();
                } else {
                    // 다리 무게에 여유가 있을 때 큐에 다음 트럭을 넣는다.
                    if (sum + truck <= weight) {
                        queue.add(truck);
                        sum += truck;
                        time++;
                        break;
                        // 무게가 초과하면 앞의 트럭을 전진시키기 위해 0을 넣는다 (큐의 size를 늘리기 위해)
                    } else {
                        queue.add(0);
                        time++;
                    }
                }
            }
        }
        return time + bridge_length;
    }

    // 다른 풀이
    static class Truck {
        int weight;
        int move;

        public Truck(int weight) {
            this.weight = weight;
            this.move = 1;
        }

        public void moving() {
            move++;
        }
    }

    public static int solution2(int bridgeLength, int weight, int[] truckWeights) {
        Queue<Truck> waitQ = new LinkedList<>();
        Queue<Truck> moveQ = new LinkedList<>();

        for (int t : truckWeights) {
            waitQ.offer(new Truck(t));
        }

        int answer = 0, curWeight = 0;

        while (!waitQ.isEmpty() || !moveQ.isEmpty()) {
            answer++;

            if (moveQ.isEmpty()) {
                Truck t = waitQ.poll();
                curWeight += t.weight;
                moveQ.offer(t);
                continue;
            }

            for (Truck t : moveQ) {
                t.moving();
            }

            if (moveQ.peek().move > bridgeLength) {
                Truck t = moveQ.poll();
                curWeight -= t.weight;
            }

            if (!waitQ.isEmpty() && curWeight + waitQ.peek().weight <= weight) {
                Truck t = waitQ.poll();
                curWeight += t.weight;
                moveQ.offer(t);
            }
        }
        return answer;
    }
}
