package Day06;


import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author lemon
 * @date 2022/1/15 17:08
 * @blog www.lemonws.top
 */
public class A1987 {
    public static void main(String[] args) {
        TreeMap<Integer,Integer> mp = new TreeMap<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int now = 0;
        int l,r;
        for (int i = 0; i < n; i++) {
            int len = in.nextInt(); char dt = in.next().charAt(0);      //direction
            if (dt == 'R') {
                l = now;
                r = now + len;
                now = r;
            } else {
                r = now;
                l = now - len;
                now = l;
            }
            mp.put(l,mp.getOrDefault(l,0) + 1); mp.put(r,mp.getOrDefault(r,0)-1);
        }

        int ans = 0, sum = 0, pre = 0;
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()){
            int i = entry.getKey();
            if(sum >= 2) ans += i - pre;
            sum += entry.getValue();
            pre = i;
        }
        System.out.println(ans);
    }
}
