package src.codeup;

import java.io.*;

public class Codeup89 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] num = br.readLine().split(" ");

        int a = Integer.parseInt(num[0]);
        int b = Integer.parseInt(num[1]);
        int c = Integer.parseInt(num[2]);
        int result = a + (c-1)*b;
        // ↑ 처음값 + (n번째수-1) * 등차값
        // 1+(5-1)*3 = 1+4*3 = 1+12 = 13;
        // 첫번째 값 + 나머지 개수 x 등차값 = 1 + 4 * 3

        bw.write(String.valueOf(result));
        br.close();
        bw.flush();
        bw.close();
    }
}
