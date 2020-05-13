package weekly;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        b_1065 answer = new b_1065();
        System.out.println(answer.search(num));
    }
    int search(int num){
        int count = 0;
        int[] check = new int[3];
        if(num < 100)
            count = num;
        else{
            count = 99;
            for(int i = 100; i <= num; i++){
                check[0] = (int)i/100;
                check[1] = (int)(i%100)/10;
                check[2] = (int)(i%100)%10;
                if((check[0]-check[1]) == (check[1] - check[2]))
                    count++;
            }
        }
        return count;
    }
}