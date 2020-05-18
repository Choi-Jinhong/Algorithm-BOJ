package daily;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_2468 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int frequency = Integer.MIN_VALUE;
        int safetyArea = 0;
        int[][] area = new int[n][n];
        StringTokenizer st;
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) {
                area[i][j] = Integer.parseInt(st.nextToken());
                if(area[i][j] > frequency)
                    frequency = area[i][j];
            }
        }
        for(int i = 1; i <= frequency; i++){
            for(int j = 0; j < n; j++){
                for(int k = 0; k < n; k++){
                    if(frequency == i)
                        System.out.println(safetyArea);
                }
            }
        }
    }
}
