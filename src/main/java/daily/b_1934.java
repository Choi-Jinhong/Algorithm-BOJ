package daily;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int a, b;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            sb.append(lcm(a,b)).append("\n");
        }
        System.out.println(sb);
    }

    public static int gcd(int a, int b){
        while(b > 0){
            int tmp = a;
            a = b;
            b = tmp % b;
        }
        return a;
    }

    public static int lcm(int a, int b){
        return a*b/gcd(a,b);
    }
}
