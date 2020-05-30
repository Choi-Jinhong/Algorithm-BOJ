package daily;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_2747 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.parseInt(br.readLine());
        int[] result = new int[n + 1];
        if(n == 0 || n == 1)
            System.out.println(n);
        else {
            result[1] = 1;
            for (int i = 2; i <= n; i++)
                result[i] = result[i - 2] + result[i - 1];
            System.out.println(result[n]);
        }
    }
}