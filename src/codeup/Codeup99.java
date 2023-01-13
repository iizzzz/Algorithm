package src.codeup;

import java.io.*;
import java.util.StringTokenizer;

public class Codeup99 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int board[][] = new int[10][10];
        int x = 1;
        int y = 1;

        for(int i=0; i<10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<10; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        while (true) {
            if (board[x][y] == 2) {
                board[x][y] = 9;
                break;
            }
            board[x][y] = 9;
            if (board[x][y+1] == 0 || board[x][y+1] == 2) {
                y++;
                continue;
            } else if(board[x][y+1] == 1) {
                if(board[x+1][y] == 0 || board[x+1][y] == 2) {
                    x++;
                    continue;
                } else if (board[x+1][y] == 1) {
                    break;
                }
            }
        }
        for (int i=0; i<10; i++) {
            for (int j=0; j<10; j++) {
                bw.write(board[i][j]+" ");
            }
            bw.write("\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
