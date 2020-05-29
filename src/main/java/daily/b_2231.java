package daily;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class b_2231 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int result=0;

        for(int i=input; i>0; i--) {
            int sum = 0;
            String input_st = String.valueOf(i);

            for(int j=0; j<input_st.length(); j++) {
                sum+=input_st.charAt(j)-48;
            }
            if(i+sum==input) {
                result = i;
            }
        }
        if(result==0) {
            System.out.println(0);
        }else
            System.out.println(result);
    }
}

