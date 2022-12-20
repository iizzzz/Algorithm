package Class1;

import java.io.*;
import java.util.StringTokenizer;

public class Baek_10950 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 테스트케이스 개수
        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        // 테스트케이스의 숫자 보다 작을때
        for (int i=0; i<T; i++) {
            // 문자열 입력받음
            st = new StringTokenizer(br.readLine(), " ");
            // nextToken + nextToken = a + b -> sb로
            sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
            // 줄바꿈
            sb.append('\n');
        }
        // 테스트 케이스의 수 만큼 더한 a+b를 출력
        bw.write(String.valueOf(sb));
        br.close();
        bw.close();
    }
}
