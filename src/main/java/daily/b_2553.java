package daily;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_2553 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int minnum = 0;
        int result = 1;
        for(int i = 1; i <= num; i++)
            result *= i;
        for(int i = 10; minnum == 0; i *= 10){
            if(result - ((result / i) * i) != 0)
                minnum = (result - ((result / i) * i))/(i/10);
        }
        System.out.println(minnum);
    }
}