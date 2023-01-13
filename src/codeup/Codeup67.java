package src.codeup;

import java.io.*;

public class Codeup67 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        // 양,음수일때의 if    +   짝,홀수일때의 if
        if (a > 0) {                    // a가 0보다 클때 = 양수
            bw.write("plus");
            bw.write("\n");
        } else {                        // a가 양수일때를 제외한 = 음수일 때
            bw.write("minus");
            bw.write("\n");
        }

        if (a % 2 == 0) {               // a가 짝수일 때
            bw.write("even");
            bw.write("\n");
        } else {                        // a가 짝수일때를 제외한 = 홀수일 때
            bw.write("odd");
            bw.write("\n");
        }
        br.close();
        bw.close();
    }
}
