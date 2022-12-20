package Class1;

import java.io.*;

public class Baek_10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        String str;

       while ((str=br.readLine()) != null) { //
            // next + next = a + b -> sb로 값 이동
           int a = str.charAt(0) - 48;
           int b = str.charAt(2) - 48;
            sb.append(a+b).append("\n");
        }
        // 테스트 케이스의 수 만큼 더한 a + b 출력
        bw.write(String.valueOf(sb));
        br.close();
        bw.flush();
        bw.close();
    }
}
