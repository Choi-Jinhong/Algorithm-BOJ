import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result[] = {0,0,0,0,0,0,0,0,0,0};
        int count = 10;
        for(int i = 0; i < 10; i++){
            result[i] = (Integer.parseInt(br.readLine())) % 42;
            for(int k = 0; k < i; k++){
                if(result[i] == result[k]){
                    result[i] = -1;
                }
            }
            if(result[i] == -1)
                count--;
        }
        System.out.println(count);
    }
}