package Class2;

/* 4153 직각삼각형 */

import java.io.*;
import java.util.StringTokenizer;

public class Baek_4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuffer sb = new StringBuffer();

        while (true) {

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            //i 세 변 입력받음
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());

            //i 마지막줄 = 0 0 0 입력받으면 종료
            if (x==0 && y==0 && z==0) break;
            //i 세 변중 어느 변이 제일 큰지 모르니 모든 경우의수를 조건에 추가
            if ((x*x + y*y) == z*z) {
                sb.append("right").append("\n");
            } else if (x*x == (y*y + z*z)) {
                sb.append("right").append("\n");
            } else if (y*y == (x*x + z*z)) {
                sb.append("right").append("\n");
            } else {
                sb.append("wrong").append("\n");
            }
        }
        bw.write(String.valueOf(sb));
        br.close();
        bw.flush();
        bw.close();
    }
}
