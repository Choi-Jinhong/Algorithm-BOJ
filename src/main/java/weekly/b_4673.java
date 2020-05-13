package weekly;

public class b_4673 {
    public static void main(String[] args) {
        b_4673 test = new b_4673();
        int[] result = new int[10001];
        int[] selfNum = new int[10001];
        for(int i = 1; i <= 10000; i++) {
            result[i] = test.d(i);
            selfNum[i] = i;
        }
        for(int j = 1; j <= 10000; j++){
            for(int k = 1; k <= 10000; k++){
                if(result[k] == j)
                    selfNum[j] = -1;
            }
        }
        for(int l = 1; l<=10000; l++)
            if(selfNum[l] > 0)
                System.out.println(selfNum[l]);
    }

    int d(int a){
        int drNum = 0;
        if(a < 10)
            drNum = a + a;
        else if(a<100)
            drNum = a + (int)a/10 + a%10;
        else if(a<1000)
            drNum = a + (int)a/100 + (int)(a%100)/10 + (a%100)%10;
        else if(a<10000)
            drNum = a + (int)a/1000 + (int)(a%1000)/100 + (int)((a%1000)%100)/10 + (int)((a%1000)%100)%10;
        return drNum;
    }
}
