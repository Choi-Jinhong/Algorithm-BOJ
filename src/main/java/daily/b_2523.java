package daily;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_2523 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count1 = Integer.parseInt(br.readLine());
        int j = 1;
        int k = 1;
        for(int i = 1; i <= (int)Math.pow(count1,2); i++){
            System.out.print("*");
            if(k == i) {
                if(i >= (count1 * count1 + count1) / 2 )
                    j--;
                else
                    j++;
                k += j;
                System.out.println("");
            }
        }
    }
}
