package weekly;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char c = 'a';
        int[] a = new int[s.length()];
        int[] count = new int[26];
        for(int j = 0; j< 26; j++)
            count[j] = 0;
        for(int i = 0; i < s.length(); i++){
            a[i] = s.charAt(i);
            if(a[i] > (int)'Z')
                a[i] -= 32;
            count[a[i]-65]++;
        }
        int max = 0;
        for(int k = 0; k < 26; k++){
            if(count[k] > max) {
                c = (char)(k+65);
                max = count[k];
            }
            else if(max == count[k])
                c = '?';
        }
        System.out.println(c);
    }
}
