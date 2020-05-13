import java.io.*;
import java.util.StringTokenizer;

public class b_10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int x = 1, y = 1;
        while(x != 0 && y != 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            if(x != 0 && y != 0)
                bw.write((x+y) + "\n");
        }
        bw.flush();
    }
}
