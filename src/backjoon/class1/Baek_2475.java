package src.backjoon.class1;

import java.io.*;
import java.util.StringTokenizer;

public class Baek_2475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int num;
        int sum = 0;
        for (int i=0; i<5; i++) {
            num = Integer.parseInt(st.nextToken());
            sum += num*num; // sum= (st[0]*st[0])+sum + (st[1]*st[1])+sum ...etc
        }
        System.out.println(sum%10);
        br.close();
    }
}