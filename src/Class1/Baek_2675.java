package Class1;

/* 문자열 반복 */

import java.io.*;

public class Baek_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력받을 테스트케이스의 수
        int testcase = Integer.parseInt(br.readLine());
        // 테스트케이스의 수 만큼 반복
        for (int i=0; i<testcase; i++) {
            // " "로 구분한 입력값 받기
            String[] str = br.readLine().split(" ");
            // 반복할 횟수를 int 타입 a에 str의 0번인덱스로 선언
            int a = Integer.parseInt(str[0]);
            // 반복할 문자열을 String 타입 A에 str의 1번인덱스로 선언
            String A = str[1];
            // str의 1번인덱스인 문자열의 길이만큼 반복
            for(int j=0; j<A.length(); j++) {
                // str의 0번인덱스인 문자열 반복횟수만큼 문자열 반복
                for(int k=0; k<a; k++) {
                    // str 의1번째 인덱스를 1글자씩 a번 반복출력
                    // a는 str의 0번째 인덱스 = 문자열 반복횟수
                    bw.write(A.charAt(j));
                }
            }
            bw.write("\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
