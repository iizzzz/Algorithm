package src.backjoon.class1;

/* 3052 Modulo */

import java.io.*;
import java.util.HashSet;

public class Baek_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        /* 10개의 값을 담을 배열 생성 */
        int[] num = new int [10];
        /* 다른 값이 몇개 있는지 셀 count */
        int count = 0;
        /* n번째와 n+1번째 수를 비교하기 위한 변수 */
        boolean abc = true;

        /* 배열에 입력값 % 42 의 결과 넣기 */
        for (int i=0; i<num.length; i++) {
            num[i] = Integer.parseInt(br.readLine()) % 42;
        }

        for (int i=0; i<num.length; i++) {
            /* 기본값을 flase로 설정하고 */
            abc = false;
            /* 배열의 i번쨰요소, i+1번째요소 비교 */
            for (int k=i+1; k<num.length; k++) {
                if (num[i] == num[k]) {
                    abc = true;
                    break;
                }
            }
            if (abc == false) {
                count++;
            }
        }
        bw.write(String.valueOf(count));
        br.close();
        bw.flush();
        bw.close();
    }
}

class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> hs = new HashSet<Integer>();

        for (int i = 0; i < 10; i++) {
            hs.add(Integer.parseInt(br.readLine()) % 42);
            //입력받은 값의 나머지 값을 add메소드를 통해 HashSet에 저장
        }
        br.close();
        System.out.print(hs.size()); //HashSet의 값 출력
    }
}
