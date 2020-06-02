package daily;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_5585 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int change = 1000 - Integer.parseInt(br.readLine());
        int coin = 0;

        while(change != 0){
            if(change >= 500){
                coin++;
                change -= 500;
            }
            else if(change >= 100){
                coin++;
                change -= 100;
            }
            else if(change >= 50){
                coin++;
                change -= 50;
            }
            else if(change >= 10){
                coin++;
                change -= 10;
            }
            else if(change >= 5){
                coin++;
                change -= 5;
            }
            else {
                coin++;
                change -= 1;
            }
        }
        System.out.println(coin);
    }
}