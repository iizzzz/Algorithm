package Codeup;

import java.io.*;
import java.util.StringTokenizer;

public class Codeup98 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] hw = br.readLine().split(" ");
        int h = Integer.parseInt(hw[0]); // 격자판 가로
        int w = Integer.parseInt(hw[1]); // 격자판 세로
        int n = Integer.parseInt(br.readLine()); // 막대의 개수
        int[][] board = new int[h][w];

        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());   // 막대 길이
            int d = Integer.parseInt(st.nextToken());   // 막대 방향
            int x = Integer.parseInt(st.nextToken())-1; // 좌표 x
            int y = Integer.parseInt(st.nextToken())-1; // 좌표 y

            if (d == 0) { // 가로, 막대 방향이 0 일때
                for (int j=y; j<y+l; j++) { //
                    board[x][j] = 1;        // board[x]축의 요소에 1식 찍음
                }
            } else {     // 세로, 막대 방향이 0이 아닐때
                for (int j=x; j<x+l; j++) {
                    board[j][y] = 1;
                }
            }
        }

        for (int i=0; i<h; i++) {
            for (int j=0; j<w; j++) {
                bw.write(board[i][j]+" ");
            }
            bw.write("\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}

