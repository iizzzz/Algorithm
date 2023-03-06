package src.programmers.고득점Kit.DFS_BFS;

public class 네트워크 {

    /* 컴퓨터의 개수 n, 연결에 대한 정보가 담긴 2차원 배열 computers */
    public int solution(int n, int[][] computers) {
        int answer = 0;

        // 방문 배열
        boolean[] check = new boolean[n];

        // 0 ~ -1개의 정점을 돌면서 방문여부 확인하면서
        // 방문안된 정점을 시작으로 간선의 연결을 확인한다.
        for (int i=0; i<n; i++) {
            if (!check[i]) {
                // 방문안된 정점은 다른 네트워크 이므로 answer++을 해줌.
                answer++;
                // dfs 호출
                dfs(i, n, computers, check);
            }
        }
        return answer;
    }

    // 시작정점을 기점으로 연결된 모든 정점을 방문처리한다.
    // 이과정을 거치면 네트워크 한개가 나오는것.
    public void dfs(int v, int n, int[][] computers, boolean[] check) {
        check[v] = true;

        for (int i=0; i<n; i++) {
            // 연결정보의 요소가 1이고, 방문체크가 false 일때
            if (computers[v][i] == 1 && !check[i]) {
                // dfs에 i를 주는건 v정점과 연결된 정점에서 시작하려는 이유 때문
                dfs(i, n, computers, check);
            }
        }
    }
}
