package weekly;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int kilo = Integer.parseInt(br.readLine());
        int bag = Integer.MAX_VALUE;
        int temp = 0;
        if(kilo < 3)
            bag = -1;
        else {
            for(int i = 0; i <= kilo / 3; i++) {
                for(int j = 0; j <= kilo / 5; j++){
                    if((kilo-(3*i))-(5*j) == 0){
                        temp = i + j;
                    }
                    else
                        continue;
                    if(bag > temp)
                        bag = temp;
                }
                if(bag == Integer.MAX_VALUE && i == kilo / 3)
                    bag = -1;
            }
        }
        System.out.println(bag);
    }
}