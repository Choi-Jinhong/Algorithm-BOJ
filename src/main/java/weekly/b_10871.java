package weekly;

import java.io.*;
import java.util.StringTokenizer;

public class b_10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int array[] = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = Integer.parseInt(st2.nextToken());
            //System.out.println(array[i]);
            if(array[i] < x){
                bw.write(array[i] + " ");
            }
        }
        bw.flush();
    }
}
