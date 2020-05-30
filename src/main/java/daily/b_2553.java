package daily;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_2553 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int minnum = 0;
        int factorial = 1;
        for(int i = 1; i <= num; i++)
            factorial *= i;
        System.out.println(false);
        System.out.println(minnum);
    }
}