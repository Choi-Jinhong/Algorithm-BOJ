package daily;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_2455 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = Integer.MIN_VALUE;
        int inPerson, outPerson, totPerson = 0;
        StringTokenizer st;
        for(int i = 0; i < 4; i++){
            st = new StringTokenizer(br.readLine());
            outPerson = Integer.parseInt(st.nextToken());
            inPerson = Integer.parseInt(st.nextToken());
            totPerson += inPerson - outPerson;
            if(max < totPerson)
                max = totPerson;
        }
        System.out.println(max);
    }
}
