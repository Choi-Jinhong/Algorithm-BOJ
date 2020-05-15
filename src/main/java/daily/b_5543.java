package daily;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_5543 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int burger = Integer.MAX_VALUE;
        int beverage = Integer.MAX_VALUE;
        for(int i = 0; i < 5; i++){
            int temp = Integer.parseInt(br.readLine());
            if(i < 3){
                if(temp < burger)
                    burger = temp;
            }
            else{
                if(temp < beverage)
                    beverage = temp;
            }
        }
        System.out.println(burger + beverage - 50);
    }
}
