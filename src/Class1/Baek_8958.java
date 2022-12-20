package Class1;

/* 8958 OX 퀴즈 */

import java.io.*;

public class Baek_8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 테스트 케이스의 개수 입력
        int a = Integer.parseInt(br.readLine());

        // 연속된 수가 있으면 합계를 저장할 score, X가 나올시 초기화 될 count 변수 선언
        // 밖에다 값을 초기화하니 이상한 값이 나와서 for문 안에 초기화시킴
        int score;
        int count;

        // 테스트 케이스의 수 만큼 반복
        for (int i = 0; i < a; i++) {
            // 입력받은 문자열
            String ox = br.readLine();
            score = 0;
            count = 0;
            // 입력받은 문자열의 길이만큼 반복
            for (int j = 0; j < ox.length(); j++) {
                // 문자열의 요소가 O 인 경우 count 1증가, 연속되면 증가한 합계 score에 저장
                if (ox.charAt(j) == 'O') {
                    count++;
                    score = score + count;
                    // 문자열의 요소가 O가 아닌경우 count 초기화
                } else {
                    count = 0;
                }
            }
            bw.write(String.valueOf(score) + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
