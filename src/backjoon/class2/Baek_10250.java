package src.backjoon.class2;
/* 10250 ACM 호텔 */
import java.io.*;
import java.util.StringTokenizer;

public class Baek_10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine()); //i 테스트 케이스 개수

        for (int i = 0; i < t; i++) {
            //i 층수 h, 호수 w, n번째 손님 입력
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken()); //i n번째 손님
            int y; //i 층에 해당하는 결과값을 넣을 변수
            int x; //i 호에 해당하는 결과값을 넣을 변수
            int result; // 결과값
            /*
            층수 = n번째손님 % 건물의 총 층수
            호수 = n번째손님 / 층수
             */
            //i 층의 변화가 없을때
            if (n % h == 0) {
                    y = h * 100;  //i 층수 = n%h==0 <- 꼭대기 층에 있으므로 호수 변화 X
                    x = n / h;    //i 호수 = n번째 손님 / 층수

            //i 층의 변화가 있을때
            } else {
                    y = (n % h) * 100;  //i 층수 = n번째손님 % 건물의 총 층수
                    x = (n / h) + 1;    //i 호수 변경이 일어나므로 +1
            }
            result = x + y;
            bw.write(String.valueOf(result)+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}