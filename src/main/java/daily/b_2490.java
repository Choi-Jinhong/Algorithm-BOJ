package daily;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_2490 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int[] result = new int[3];
        for(int i = 0; i < 3; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 4; j++)
                result[i] += Integer.parseInt(st.nextToken());
            if(result[i] == 0)
                sb.append('D').append("\n");
            else if(result[i] == 4)
                sb.append('E').append("\n");
            else
                sb.append((char)(68 - result[i])).append("\n");
        }
        System.out.println(sb);
    }
}