package daily;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 1;
        if(n == 0){
            System.out.println(result);
        }
        else {
            for (int i = n; i >= 1; i--) {
                if (i == 1)
                    System.out.println(result);
                else
                    result *= i;
            }
        }
    }
}