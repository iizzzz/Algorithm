package src.backjoon.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_1330 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine(); // 굳이 변수생성안하고 st 안에 넣어서 생성해도됨
// ↑ readLine()은 한 행을 전부 읽으므로 공백단위로 분리해야함
// 다른 분리방법으로 split을 사용해도 됨
        StringTokenizer st = new StringTokenizer(str," "); // 분리
// st.nextToken() 은 문자열을 반환하니 Integer.parseInt()로 int 형으로 변환시켜준다
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println((a>b) ? ">" : ((a<b) ? "<" : "=="));
    }
}
