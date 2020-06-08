package daily;

import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class b_1075 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int f = Integer.parseInt(br.readLine());

        int temp = (n - n%100) % f;
        if(temp != 0)
            temp = f - temp;
        String s = Integer.toString(temp);
        if(s.length() == 1)
            System.out.println("0"+s);
        else
            System.out.println(s);
    }
}