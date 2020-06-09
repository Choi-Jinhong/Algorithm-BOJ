package daily;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] c = new char[15][5];
        String s = "";
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 15; j++){
                c[j][i] = ' ';
            }
        }

        for(int i = 0; i < 5; i++) {
            s = br.readLine();
            for(int j = 0; j < s.length(); j++){
                c[j][i] = s.charAt(j);
            }
        }

        for(int i = 0; i < 15; i++){
            for(int j = 0; j < 5; j++){
                if(c[i][j] != ' ') {
                    System.out.print(c[i][j]);
                }
            }
        }
    }
}
