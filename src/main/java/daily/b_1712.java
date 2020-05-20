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
        int count = 1;
        if(fee2 >= price)
            count = -1;
        else {
            for (int i = 1; (fee1 + (fee2 * i)) >= (price * i); i++)
                count++;
        }
        System.out.println(count);
    }
}