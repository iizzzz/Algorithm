package Class1;

/* 1546 평균 */

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Double[] num = new Double[Integer.parseInt(br.readLine())];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 배열의 요소에 각 과목의 점수를 입력받음
        for(int i=0; i<num.length; i++) {
            num[i] = Double.parseDouble(st.nextToken());
        }
        // 평균값을 출력할 변수 초기화
        double sum = 0;
        // 입력받은 배열의 요소 오름차순 정렬, 최대값 = 마지막 요소
        Arrays.sort(num);


        for(int i=0; i<num.length; i++) {
            // num의 각 요소 / 최대값 * 100 = sum
            sum = sum + ((num[i] / num[num.length-1]) * 100);
        }
        // 평균값 / 과목의 수
        double result = sum / num.length;

        bw.write(String.valueOf(result));
        br.close();
        bw.flush();
        bw.close();
    }
}
