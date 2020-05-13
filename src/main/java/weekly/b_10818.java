package weekly;

import java.io.*;
import java.util.StringTokenizer;

public class b_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int a[] = {0, 0, 0}; // max = a[0], min = a[1], compare of number a[2]
        StringTokenizer st = new StringTokenizer(br.readLine());
        a[0] = Integer.parseInt(st.nextToken());
        a[1] = a[0];
        for(int i = 1; i < n; i++){
            a[2] = Integer.parseInt(st.nextToken());
            if (a[2] > a[0])
                a[0] = a[2];
            else if(a[2] < a[1])
                a[1] = a[2];
        }
        System.out.println(a[1] + " " + a[0]);
    }
}