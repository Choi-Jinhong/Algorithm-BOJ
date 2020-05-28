package daily;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] building = new int[3]; // [0] == H, [1] == W, [2] == visitorSeq
        int room = 0;
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < building.length; j++)
                building[j] = Integer.parseInt(st.nextToken());
            room = (building[2] - (building[2] / building[0]) * building[0]) * 100;
            if(room == 0)
                room = building[0] * 100;
            if(building[2] % building[0] == 0)
                room += building[2] / building[0];
            else
                room += building[2] / building[0] + 1;
            sb = sb.append(room).append("\n");
        }
        System.out.println(sb);
    }
}