package daily;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int checker = 3;
        int next = 2;
        int x = 1, y = 1;
        for(int i = 2; i <= n; i++){
            if(next == i) {
                next = ((checker) * (checker) - (checker) + 2) / 2;
                checker++;
                if(x > y)
                    x++;
                else
                    y++;
            }
            else {
                switch (checker % 2) {
                    case 1:
                        x--;
                        y++;
                        break;
                    case 0:
                        x++;
                        y--;
                        break;
                }
            }
        }
        System.out.println(x + "/" + y);
    }
}