package daily;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] card = new int[n];
        int temp;
        int result = Integer.MIN_VALUE;

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            card[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 0; i < card.length; i++){
            for(int j = 0; j < card.length; j++) {
                if(j == i)
                    continue;
                else {
                    for (int k = 0; k < card.length; k++) {
                        if(k == j || k == i)
                            continue;
                        else {
                            temp = card[i] + card[j] + card[k];
                            if (m >= temp && result <= temp)
                                result = temp;
                        }
                    }
                }
            }
        }
        System.out.println(result);
    }
}