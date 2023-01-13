package src.codeup;

import java.io.*;

public class Codeup80 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int sum = 0;
        int count = 1;


        while (sum < a) {           // 합이 입력값보다 작을때
            sum = sum + count;      // 합=count+count ..etc
            count++;                // 1번 sum 에 더해질때마다 카운트 1씩 증가
        }
        bw.write(String.valueOf(count-1));
        br.close();
        bw.close();
    }
}
