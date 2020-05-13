package weekly;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] alphabet = new int[26];
        for(int i = 0; i < 26; i++)
            alphabet[i] = -1;
        for(int j = s.length() - 1; j >= 0; j--){
            for(int k = 25; k >= 0; k--){
                if(s.charAt(j) == 97 + k){
                    alphabet[k] = j;
                }
            }
        }
        for(int l = 0; l < 26; l++)
            System.out.print(alphabet[l] + " ");
    }
}