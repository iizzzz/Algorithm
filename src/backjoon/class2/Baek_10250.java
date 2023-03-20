package src.backjoon.class2;
/* 10250 ACM 호텔 */
import java.io.*;
import java.util.StringTokenizer;

public class Baek_10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // 테스트 케이스 개수
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            // 층수 h, 호수 w, n번째 손님 입력
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int h = Integer.parseInt(st.nextToken());
            st.nextToken(); // w는 필요없으므로 그냥 버린다.
            int n = Integer.parseInt(st.nextToken()); //i n번째 손님

            /*
             * 층수 = n번째손님 % 건물의 총 층수
             * 호수 = n번째손님 / 층수
             */

            /* 층의 변화가 없을때
             * 층수 = n%h==0 <- 꼭대기 층에 있으므로 호수 변화 X
             * 호수 = n번째 손님 / 층수
             */
            if (n % h == 0) {
                sb.append((h * 100) + (n / h)).append('\n');
            /* 층의 변화가 있을때
             * 층수 = n번째손님 % 건물의 총 층수
             * 호수 변경이 일어나므로 +1
             */
            } else {
                sb.append(((n % h) * 100) + (n / h) + 1).append('\n');
            }
        }
        System.out.print(sb);
        br.close();
    }
}