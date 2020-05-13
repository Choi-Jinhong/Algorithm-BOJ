package weekly;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_10039 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int avg = 0;
        for(int i = 0; i < 5; i++){
            int a = Integer.parseInt(br.readLine());
            if(a < 40)
                a = 40;
            avg += a;
        }
        System.out.println(avg/5);
    }
}