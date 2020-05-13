import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int time = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= 'A' && s.charAt(i) <='C')
                time += 3;
            else if(s.charAt(i) >= 'D' && s.charAt(i) <='F')
                time += 4;
            else if(s.charAt(i) >= 'G' && s.charAt(i) <='I')
                time += 5;
            else if(s.charAt(i) >= 'J' && s.charAt(i) <='L')
                time += 6;
            else if(s.charAt(i) >= 'M' && s.charAt(i) <='O')
                time += 7;
            else if(s.charAt(i) >= 'P' && s.charAt(i) <='S')
                time += 8;
            else if(s.charAt(i) >= 'T' && s.charAt(i) <='V')
                time += 9;
            else if(s.charAt(i) >= 'W' && s.charAt(i) <='Z')
                time += 10;
        }
        System.out.println(time);
    }
}
