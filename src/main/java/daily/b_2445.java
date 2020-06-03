package daily;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_2445 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++){
            for(int k = 0; k <= i; k++)
                System.out.print("*");
            for (int j = 2; j < (n - i) * 2; j++)
                System.out.print(" ");
            for(int k = 0; k <= i; k++)
                System.out.print("*");
            System.out.println("");
        }
        for(int i = 1; i < n; i++){
            for(int k = 0; k < (n - i); k++)
                System.out.print("*");
            for(int j = 0; j < i * 2; j++)
                System.out.print(" ");
            for(int k = 0; k < (n - i); k++)
                System.out.print("*");
            System.out.println("");
        }
    }
}
