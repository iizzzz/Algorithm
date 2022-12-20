package Class1;

/* 숫자의 개수 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /* ---------------------------
        입력값 3개의 합17037300
        arr[srt.charAt(0) - '0'] ++
        arr[i]++ // i번쨰 인덱스에 +1 추가

        // 0으로 초기화된 arr 배열
        0 + 1 char2 +1 char 6 +1 char 7
        0 + 1  char0
        0
        0 +1 char3 +1 char 5
        0
        0
        0
        0 + 1 char1 +1 char4
        0
        0

        결과값
        3102000200
        ---------------------------- */

        // 0~9의 숫자가 각각 몇개인지 저장하기 위한 10개 값을 저장할 배열 생성
        int[] arr = new int [10];
        // 곱할 3개의 입력값 선언
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        // 곱한값의 길이를 이용해 순회하기 위해 String으로 변환후
        String str = Integer.toString(a*b*c);

        // str의 길이만큼 모든요소검사, (해당 인덱스의 문자 == i)
        // 자기자신
        for (int i=0; i<str.length(); i++) {
                arr[str.charAt(i) - '0']++;
        }
        // 배열 출력
        for (int i=0; i<10; i++) {
            System.out.println(arr[i]);
        }
        br.close();
    }
}
