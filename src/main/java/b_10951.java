import java.io.*;
import java.util.StringTokenizer;

public class b_10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int x, y;
        while((line = br.readLine()) != null){
            StringTokenizer st = new StringTokenizer(line);
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            System.out.println(x+y);
        }
    }
}