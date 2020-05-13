import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int cnt = 0;
        for(int i = 0; i < s.length(); i++) {
            cnt++;
            switch(s.charAt(i)) {
                case 'c':
                    if(i < (s.length() - 1) && (s.charAt(i+1) == '=' || s.charAt(i+1) == '-'))
                        i++;
                    break;
                case 'l':
                case 'n':
                    if(i < (s.length() - 1) && s.charAt(i+1) == 'j')
                        i++;
                    break;
                case 's':
                case 'z':
                    if(i < (s.length() - 1) && s.charAt(i+1) == '=')
                        i++;
                    break;
                case 'd':
                    if(i < (s.length() - 2) && (s.charAt(i+1) == 'z' && s.charAt(i+2) == '='))
                        i+=2;
                    else if(i < (s.length() - 1) && s.charAt(i+1) == 'z')
                        i++;
                    break;
            }
        }
        System.out.println(cnt);
        br.close();
    }
}*/
public class b_2941{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] c = {"c=", "c-", "d-", "dz=", "z=", "s=", "nj", "lj"};
        for(int i = 0; i < 8; i++)
            s = s.replace(c[i], "a");
        System.out.println(s.length());
    }
}