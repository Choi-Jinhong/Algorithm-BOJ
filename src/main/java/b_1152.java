import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int count = 1;
        if(s.charAt(0) == ' ' && s.length() == 1)
            count = 0;
        for(int i = 1; i < (s.length()-1); i++){
            if(s.charAt(i) == ' ')
                count++;
        }
        System.out.println(count);
    }
}