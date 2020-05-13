package weekly;

import java.io.*;

public class b_2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a[] = {1, 1, 1};
        int count[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for(int i = 0; i <= 2 ; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        String str = Integer.toString(a[0] * a[1] * a[2]);
        for(int k = 0; k < str.length(); k++){
            if( str.charAt(k) == '0')
                count[0]++;
            else if(str.charAt(k) == '1')
                count[1]++;
            else if(str.charAt(k) == '2')
                count[2]++;
            else if(str.charAt(k) == '3')
                count[3]++;
            else if(str.charAt(k) == '4')
                count[4]++;
            else if(str.charAt(k) == '5')
                count[5]++;
            else if(str.charAt(k) == '6')
                count[6]++;
            else if(str.charAt(k) == '7')
                count[7]++;
            else if(str.charAt(k) == '8')
                count[8]++;
            else
                count[9]++;
        }
        bw.write(count[0] + "\n" + count[1] + "\n" + count[2] + "\n" + count[3] + "\n" + count[4] + "\n" + count[5] + "\n" + count[6] + "\n" + count[7] + "\n" + count[8] + "\n" + count[9] + "\n");
        bw.flush();
    }
}
