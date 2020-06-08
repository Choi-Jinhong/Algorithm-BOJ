package daily;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_1225 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String n1 = st.nextToken();
        String n2 = st.nextToken();
        long result = 0;

        for(int i = 0; i < n1.length(); i++){
            for(int j = 0; j < n2.length(); j++){
                result += ((n1.charAt(i) - 48) * (n2.charAt(j) - 48));
            }
        }
        System.out.println(result);
    }
}