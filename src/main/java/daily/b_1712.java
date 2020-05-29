package daily;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int fee1 = Integer.parseInt(st.nextToken());
        int fee2 = Integer.parseInt(st.nextToken());
        int price = Integer.parseInt(st.nextToken());
        if(fee2 >= price)
            System.out.println(-1);
        else
            System.out.println(fee1 / (price - fee2) + 1);
    }
}