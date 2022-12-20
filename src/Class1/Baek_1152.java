package Class1;

/* 단어의 개수 */

import java.io.*;
import java.util.StringTokenizer;

public class Baek_1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int count = st.countTokens(); // 토큰 수 count

        System.out.println(count);
    }
}