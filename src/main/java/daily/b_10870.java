package daily;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_10870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n =Integer.parseInt(br.readLine());
        int[] array = new int[n + 1];

        for(int i = 0; i < n + 1; i++){
            if(i == 0 || i == 1)
                array[i] = i;
            else
                array[i] = array[i-2] + array[i-1];
        }

        System.out.println(array[n]);
    }
}