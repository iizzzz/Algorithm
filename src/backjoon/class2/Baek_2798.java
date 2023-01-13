package src.backjoon.class2;

/* 2798 블랙잭 */

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek_2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //i 1번째 Tokenizer 객체 = 카드 개수, 최대값을 입력받음
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        //i 카드의 개수 n, 최대값 m, 들고있는 카드 개수 배열 card 선언
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] card = new int[n];

        //i 입력받는 값 사이에 개행 삽입, 카드의 숫자, max = 카드 3장의 숫자 합계
        st = new StringTokenizer(br.readLine(), " ");
        int max = 0;

        //i 입력받은 카드의 숫자를 카드개수(n)만큼 배열(card)의 요소에 넣기
        for (int i=0; i<n; i++) {
            card[i] = Integer.parseInt(st.nextToken());
        }

        //i 배열 오름차순 정렬
        Arrays.sort(card);
        //i 순서가 +1씩 차이나는 요소 순회
        for (int i=0; i<card.length-2; i++) {
            for (int j=i+1; j<card.length-1; j++) {
                for (int k=j+1; k<card.length; k++) {
                    int sum=0;

                    //i 3개의 요소를 순회하면서 더함
                    sum = sum+ card[i] + card[j] + card[k];

                    //i 3개 값을 더한 합이 m에 가까워질때까지 3개의 i,j,k 요소들을 합함
                    if (sum <= m) {

                        //i max,sum중 더 큰값을 max 변수에 저장
                        max = Math.max(max, sum);
                    }
                }
            }
        }
        bw.write(String.valueOf(max));
        br.close();
        bw.flush();
        bw.close();
    }
}