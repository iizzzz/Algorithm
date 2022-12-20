package Class1;
/* 기찍 N */

import java.io.*;

public class Baek_2742 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        for (int i=0; i<a; i++) {      /* 5-0, 5-1, 5-2, 5-3, 5-4, */
            bw.write((a-i)+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
