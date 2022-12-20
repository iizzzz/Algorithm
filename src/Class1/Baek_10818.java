package Class1;

// 최소, 최대

import java.io.*;
import java.util.StringTokenizer;

public class Baek_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력받을 숫자의 개수
        int a = Integer.parseInt(br.readLine());
        // 결과값을 담을 배열 생성
        int max,min;
        // 입력받을 숫자들
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 첫번째 요소를 최소 및 최대값으로 지정
        max = min = Integer.parseInt(st.nextToken());

        // 두번째 요소(1)부터 끝까지 순회하며 최소,최대값 찾기
        for (int i=1; i<a; i++) {
            // 숫자를 입력받고 이 숫자들로 최소,최대값을 밑의 if 문에서 걸러냄
            int num = Integer.parseInt(st.nextToken());
            // 꺼낸 값이 최대값보다 클 경우 더 큰 num이 max가 됨
            if (num > max) {
                max = num;
            }
            // 꺼낸 값이 최소값보다 작을 경우 더 작은 num이 min이 됨
            if (num < min) {
                min = num;
            }
        }
        bw.append(min + " " + max);
        br.close();
        bw.flush();
        bw.close();
    }
}
