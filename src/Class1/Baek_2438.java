package Class1;

import java.io.*;

public class Baek_2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int N = Integer.parseInt(str);
        br.close();
        // 많은 System.out.println은 부하를 일으키므로 StringBuilder를 사용하자
        StringBuilder sb = new StringBuilder();

        for (int i=1; i<=N; i++) {
            for (int j=1; j<=i; j++) {
                sb.append('*');
            }
            sb.append('\n');
        }
        bw.write(String.valueOf(sb));
        br.close();
        bw.close();
    }
}