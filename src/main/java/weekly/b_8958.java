package weekly;

import java.io.*;

public class b_8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int total[] = new int[n];
        int x = 0;
        String ox[] = new String[n];
        for(int i = 0; i < n; i++){
            ox[i] = br.readLine();
            total[i] = 0;
            String store[] = ox[i].split("X");
            for(int k = 0; k < store.length; k++) {
                for (int j = 0; j < store[k].length(); j++) {
                    x = x + 1;
                    total[i] = total[i] + x;
                }
                x = 0;
            }
            bw.write(total[i] + "\n");
        }
        bw.flush();
    }
}