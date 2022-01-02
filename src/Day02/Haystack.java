package Day02;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author lemon
 * @date 2022/1/2 21:54
 * @blog www.lemonws.top
 */
public class Haystack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] b = new int[n+1];
        while(k-- > 0){
            int l = sc.nextInt(), r = sc.nextInt();
            b[l]++; b[r+1]--;
        }
        for(int i = 1; i <= n; i++){
            b[i] += b[i-1];
        }
        Arrays.sort(b);
        System.out.println(b[n/2]);
    }
}
