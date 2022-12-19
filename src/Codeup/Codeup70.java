package Codeup;

import java.io.*;

public class Codeup70 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        switch (a) {
            case 1: case 2: case 12: bw.write("winter"); break;
            case 3: case 4: case 5: bw.write("spring"); break;
            case 6: case 7: case 8: bw.write("summer"); break;
            default: bw.write("fall");
        }
        br.close();
        bw.close();
    }
}
