package src.codeup;

import java.io.*;
import java.util.StringTokenizer;

public class Codeup94 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine()); // 입력받을 개수
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] num = new int[a]; // 몇번 입력받을지에 대한 개수를 배열에 넣어서 횟수

        for (int i=a-1; i>-1; i--) { // i=배열의 인덱스값
            num[i] = Integer.parseInt(st.nextToken());
        }

        for (int i : num) {
            bw.write(i+" ");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
