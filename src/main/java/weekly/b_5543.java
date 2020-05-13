package weekly;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_5543 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int set = 0;
        int temp = 0;
        for(int i = 0; i < 5; i++){
            if(i >= 0 && i <= 2){
                int h_price = Integer.parseInt(br.readLine());
                if(temp < h_price)
                    temp = h_price;
            }
            else{

            }
        }
    }
}