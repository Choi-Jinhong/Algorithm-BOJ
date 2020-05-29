package daily;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_13458 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int[] space = new int[n];
        long totperson = 0;
        for(int i = 0; i < space.length; i++)
            space[i] = Integer.parseInt(st1.nextToken());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int superVisor = Integer.parseInt(st2.nextToken());
        int subVisor = Integer.parseInt(st2.nextToken());
        for(int i = 0; i < space.length; i++){
            totperson++;
            if(space[i] - superVisor <= 0)
                continue;
            if(space[i] > superVisor) {
                totperson += (space[i] - superVisor) / subVisor;
                if((space[i] - superVisor) % subVisor != 0)
                    totperson++;
            }
        }
        System.out.println(totperson);
    }
}