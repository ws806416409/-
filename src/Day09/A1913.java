package Day09;

import java.util.*;

/**
 * @author lemon
 * @date 2022/1/20 11:21
 * @blog www.lemonws.top
 */
public class A1913 {

    static int maxn = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Cow> cows = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int xi = in.nextInt(), bi = in.next().charAt(0) == 'G' ? -1 : 1;
            cows.add(new Cow(xi, bi));
        }
        Collections.sort(cows);
        /*for (Cow cow: cows) {
            System.out.print(cow.x + " ");
            System.out.println(cow.b);
        }*/
        cows.add(new Cow(0,0));
        int sum = 0, ans = -1, h = maxn, g = maxn;
        Map<Integer, Integer> map = new TreeMap<>();
        map.put(0, cows.get(0).x);
        for(int i = 0; i < n; i++) {
            int idx = cows.get(i).x;
            int type = cows.get(i).b;
            if (type == 1) {
                h = Math.min(h, idx);
                ans = Math.max(ans, idx - h);
                g = maxn;
            } else{
                g = Math.min(g, idx);
                ans = Math.max(ans, idx - g);
                h = maxn;
            }
            sum += type;
            if(!map.containsKey(sum)) map.put(sum, cows.get(i+1).x);
            else ans = Math.max(ans, idx - map.get(sum));
        }
        System.out.println(ans);
    }

    public static class Cow implements Comparable<Cow>{

        int x;
        int b;

        public Cow(int x, int b) {
            this.x = x;
            this.b = b;
        }

        @Override
        public int compareTo(Cow o) {
            return this.x - o.x;
        }
    }
}
