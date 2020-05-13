package weekly;

import java.io.*;
import java.util.StringTokenizer;

public class b_4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testcase = Integer.parseInt(br.readLine());
        double averScore[] = new double[testcase];
        for(int i = 0; i < testcase; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int member = Integer.parseInt(st.nextToken());
            int score[] = new int[member];
            int count = 0;
            averScore[i] = 0.0;
            for(int k = 0; k < member; k++){
                score[k] = Integer.parseInt(st.nextToken());
                averScore[i] = averScore[i] + (double)score[k];
            }
            averScore[i] = averScore[i]/member;
            for(int j = 0; j < member; j++){
                if(score[j] > averScore[i])
                    count++;
            }
            bw.write(String.format("%.3f", ((double)count/member)*100.0) + "%" + "\n");
        }
        bw.flush();
    }
}