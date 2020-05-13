package weekly;

import java.io.*;
import java.util.StringTokenizer;

public class b_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char reverse[] = new char[7];
        for(int i = 6; i >= 0; i--){
            reverse[6-i] = s.charAt(i);
        }
        s = String.valueOf(reverse);
        StringTokenizer st = new StringTokenizer(s);
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        if(X > Y)
            System.out.println(X);
        else
            System.out.println(Y);
    }
}