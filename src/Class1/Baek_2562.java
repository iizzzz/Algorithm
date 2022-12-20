package Class1;
/* 최댓값 */

import java.io.*;

public class Baek_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        /* 9개의 요소를 가진 배열, 최대값, 인덱스값 선언 */
        int[] num = new int[9];
        int count = 0;
        int max = 0;

        /* 배열에 입력값을 요소로 넣어줌 */
        for (int i=0; i<num.length; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }

        /* 입력된 요소를 카운트하여 count를 증가시키고, max에 제일 큰수가 들어가면 if문 종료 */
        /* count에 +1을 해준건 인덱스는 0부터 카운트를 하기 때문 */
        for (int i=0; i<num.length; i++) {
            if (max<num[i]) {
                max = num[i];
                count = i+1;
            }
        }
    bw.write(String.valueOf(max));
    bw.newLine();
    bw.write(String.valueOf(count));
    br.close();
    bw.flush();
    bw.close();
    }
}
