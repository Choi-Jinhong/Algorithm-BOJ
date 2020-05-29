package daily;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_2446 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int s_count = n * 2- 1;
        int e_count = 0;

        for(int i = 0; i < n * 2 - 1; i++){
            for(int j = 0; j < e_count; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < s_count; j++){
                System.out.print("*");
            }
            if(i < n - 1){
                e_count++;
                s_count -= 2;
            }
            else{
                e_count--;
                s_count += 2;
            }
            System.out.println("");
        }

    }
}
