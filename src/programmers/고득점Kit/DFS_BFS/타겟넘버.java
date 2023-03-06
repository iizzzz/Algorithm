package src.programmers.고득점Kit.DFS_BFS;

public class 타겟넘버 {
    static int answer = 0;

    public int solution(int[] numbers, int target) {
        // +1부터 시작
        dfs(numbers,numbers[0],target,0);
        // -1부터 시작
        dfs(numbers,-1 * numbers[0], target,0);

        return answer;
    }

    void dfs(int[] numbers,int num, int target, int idx) {
        // 뽑은 수가 5 개일때 타겟 넘버가 만들어졌다면 case ++
        if (idx==numbers.length-1) {
            if(num == target) {
                answer++;
            }
            return;
        }
        idx++;
        // 더하기
        dfs(numbers,num+numbers[idx],target,idx);
        // 빼기
        dfs(numbers,num-numbers[idx],target,idx);
    }
}
