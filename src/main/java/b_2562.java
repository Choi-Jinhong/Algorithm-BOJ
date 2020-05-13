import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 1;
        int max = 0;
        int i = 0;
        int n;
        while(count < 10) {
            n = Integer.parseInt(br.readLine());
            if(max < n){
                max = n;
                i = count;
            }
            count++;
        }
        System.out.println(max + "\n" + i);
    }
}
