package Codeup;

import java.io.*;
import java.util.StringTokenizer;

public class Codeup97 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[][] board = new int[19][19];

        for(int i=0; i<19; i++) { // 바둑판 깔기
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=0; j<19; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int a = Integer.parseInt(br.readLine()); // 십자 뒤집기 횟수
        for (int i=0; i<a; i++) { // 십자 뒤집기 좌표 = a가 되도록
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken())-1;
            int y = Integer.parseInt(st.nextToken())-1;

            for(int j=0; j<19; j++) {   // x좌표 값 변경
                if (board[x][j] == 0) { // 0이면 1로 변환
                    board[x][j] = 1;
                } else {                // 아니면 0으로
                    board[x][j] = 0;
                }
            }
            for(int j=0; j<19; j++) {   // y좌표 값 변경
                if(board[j][y] == 0) {  // 0이면 1로 반환
                    board[j][y] = 1;
                } else {                // 아니면 0으로
                    board[j][y] = 0;
                }
            }
        }

        for (int i=0; i<19; i++) {      // 출력
            for (int j=0; j<19; j++) {
                bw.write(board[i][j]+" ");
            }
            bw.write("\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
