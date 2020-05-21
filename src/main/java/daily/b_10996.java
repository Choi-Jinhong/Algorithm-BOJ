package daily;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_10996 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        for(int i = 1; i <= count*2; i++){
            if(i % 2 != 0) {
                for (int j = 0; j < count; j++) {
                    if(j % 2 != 0)
                        System.out.print(" ");
                    else
                        System.out.print("*");
                }
            }
            else{
                for (int j = 0; j < count; j++) {
                    if(j % 2 != 0)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
