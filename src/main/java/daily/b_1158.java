package daily;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//실패, 틀린부분 차후 확인
public class b_1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int count = 0;
        int x = 0;
        boolean[] flag = new boolean[n + 1];
        sb.append("<");
        for(int i = 0; i < flag.length; i++)
            flag[i] = true;
        while(true){
            x++;
            if(x > n)
                x = 1;
            if(flag[x])
                count++;
            if(count == k){
                sb.append(x).append(", ");
                flag[x] = false;
                count = 0;
            }
            if(sb.length() > 3 * n)
                break;
        }
        String s = sb.substring(0, sb.length() - 2);
        s = s + ">";
        System.out.println(s);
    }
}
