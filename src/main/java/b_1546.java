import java.io.*;
import java.util.StringTokenizer;

public class b_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        double score[] = new double[n];
        double max = 0.0;
        double average = 0.0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            score[i] = (double)Integer.parseInt(st.nextToken());
            if(score[i] > max)
                max = score[i];
            average = average + score[i];
        }
        System.out.println(((average/max)*100)/n);
    }
}