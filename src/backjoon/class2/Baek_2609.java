package src.backjoon.class2;

import java.io.*;
import java.util.StringTokenizer;

/* 2609 최대공약수와 최소공배수 */
public class Baek_2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        System.out.println(gcd(A, B));
        System.out.println(lcm(A, B));
        br.close();
    }

    //i 최대 공배수
    public static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    //i 최소 공배수
    public static int lcm(int a, int  b) {
        return a * b / gcd(a, b);
    }
}
