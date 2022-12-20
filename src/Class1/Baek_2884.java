package Class1;

/* 알람 시계 */

import java.io.*;
import java.util.StringTokenizer;

public class Baek_2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        /* if = 분 이 45보다 작으면 */
        /* 시를 1 뺴고 60-(45-m) */
        /* if 속 if = 시 가 0보다 작아지면 시 = 23시 */
        /* 시가 0이 아니면 시 + 분 출력 */
        /* else = 분이 45보다 클때 시 + (분-45) 그대로 출력 */
        if (m < 45) {
            h--;
            m = 60 - (45 - m);
            if (h < 0) {
                h = 23;
            }
            System.out.println(h + " " + m);
        } else {
            System.out.println(h + " " + (m - 45));
        }
        br.close();
    }
}
