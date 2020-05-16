package daily;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_5596 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int s = 0;
        int t = 0;
        while(st1.hasMoreTokens()){
            s += Integer.parseInt(st1.nextToken());
            t += Integer.parseInt(st2.nextToken());
        }
        if(s >= t)
            System.out.println(s);
        else
            System.out.println(t);
    }
}
