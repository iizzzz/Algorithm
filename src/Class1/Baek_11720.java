package Class1;
/* 숫자의 합 */

import java.io.*;

public class Baek_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());        /* n개의 숫자 입력 */
        String[] num = br.readLine().split("");   /*합할 공백없는 숫자*/
        int sum = 0;                                    /*      합계     */

        for (int i=0; i<a; i++) {                       /*    입력값의 횟수만큼 반복    */
            sum = sum + Integer.parseInt(num[i]);       /* 합=num배열의 요소 1개씩 더함 */
        }
        bw.write(String.valueOf(sum));                  /* 합계 출력 */
        br.close();
        bw.flush();
        bw.close();
    }
}
