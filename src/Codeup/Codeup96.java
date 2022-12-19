package Codeup;

import java.io.*;
import java.util.StringTokenizer;

public class Codeup96 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        int board[][] = new int[19][19]; // 바둑판 2차원 배열 생성

        for(int i=0; i<a; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            board[x-1][y-1] = 1;
            // i 증가할때마다 board[1-0][1-0] = board[0][0] 좌표에 1을찍음;
            // i 증가 board[2-1][2-1] = board[1][1] 좌표에 1을 찍음
            // i 증가 board[3-1][3-1] = board[2][2] 좌표에 1을찍음
        }
        // 출력 ㅡㅡㅡ ㅣㅣㅣ 순으로 출력
        for(int i=0; i<19; i++) { // 한 줄씩 (위->아래)
            for(int j=0; j<19; j++) { // 한 열씩 (왼->오)
                bw.write(board[i][j]+" ");
            }
            bw.write("\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
