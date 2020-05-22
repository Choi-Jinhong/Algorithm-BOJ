package daily;

import java.io.*;
import java.util.StringTokenizer;

public class b_1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int startNum = Integer.parseInt(st.nextToken());
        int endNum = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        for(int i = startNum; i <= endNum; i++){
            boolean primeNum = true;
            for(int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primeNum = false;
                    break;
                }
            }
            if(primeNum && i != 1)
                sb.append(i).append("\n");
        }
        System.out.println(sb);
    }
}