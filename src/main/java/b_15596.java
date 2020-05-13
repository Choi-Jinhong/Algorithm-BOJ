import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_15596 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int r = 0; r < a.length; r++)
            a[r] = Integer.parseInt(st.nextToken());
        Test test = new Test();
        test.sum(a);
        System.out.println(test.result);
    }
}

class Test{
    long result = 0;
    public long sum(int[] a){
        for(int i = 0; i < a.length; i++){
            result = result + a[i];
        }
        return result;
    }
}