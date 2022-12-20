package Class1;

import java.io.*;
import java.util.Arrays;

public class Baek_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine();

        int[] arr = new int[26];
        // 배열의 요소를 -1로 모두 초기화 Arrays.fill() 새로 알게 된 메소드
        Arrays.fill(arr, -1);

        // 문자열의 각 문자 검사
        for (int i=0; i<S.length(); i++) {
            char ch = S.charAt(i);     // 각 문자 추출 후 ch라는 변수에 저장
            if (arr[ch - 'a'] == -1) { // arr[S[i번째문자] - a(아스키코드)]가 -1 이라면
                arr[ch - 'a'] = i;     // arr[S[i번째문자] - a(아스키코드)] = i
            }
        }
        for (int value: arr) { // 배열 출력
            bw.write(value + " ");
        }

        br.close();
        bw.close();
    }
}
