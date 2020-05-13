package weekly;

import java.io.*;
import java.util.StringTokenizer;

public class b_1110{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x, y, first;
        int count = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        first = Integer.parseInt(st.nextToken());
        x = first;
        while(first != 8888){
            if(x < 10){
                x = ((x%10)*10) + x;
                count++;
            }
            else {
                y = ((x - (x%10))/10) + (x%10);
                x = ((x%10)*10) + (y%10);
                count++;
            }
            if (x == first)
                first = 8888;
        }
        System.out.println(count);
    }
}