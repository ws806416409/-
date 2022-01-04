package Day03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author lemon
 * @date 2022/1/3 21:33
 * @blog www.lemonws.top
 */
public class Cow {
    static int n,m;
    static char[][] mp;
    static int[][] dd = {{1,0},{-1,0},{0,-1},{0,1}};
    static List<point> list1 = new ArrayList<>();
    static List<point> list2 = new ArrayList<>();
    public static void dfs(int x,int y, List<point> list) {
        list.add(new point(x,y));
        mp[x][y] = '$';
        for(int i = 0; i < 4; i++){
            int dx = x + dd[i][0];
            //System.out.print("dx: " + dx);
            int dy = y + dd[i][1];
            //System.out.println("dy: " + dy);
            //System.out.println("mp:" + mp[dx][dy]);
            if(dx >= 0 && dx < n && dy >= 0 && dy < m && mp[dx][dy] == 'X'){
                System.out.println("mp:" + mp[dx][dy]);
                dfs(dx, dy, list);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        mp = new char[n][m];
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < n; i++) {
            mp[i] = in.readLine().toCharArray();
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(mp[i][j] == 'X' && list1.isEmpty()){
                    dfs(i,j,list1);
                }
                if(mp[i][j] == 'X' && !list1.isEmpty()){
                    dfs(i,j,list2);
                }
            }
        }
        /*for (int i = 0; i < n; i++) {
            System.out.println(mp[i]);
        }*/
        for(point p : list2){
            System.out.print("x: " + p.x);
            System.out.println("y: " + p.y);
        }
        int res = Integer.MAX_VALUE;
        for(point p1 : list1){
            for(point p2 : list2){
                res = Math.min(res, (Math.abs(p2.x - p1.x) + Math.abs(p2.y - p1.y))-1);
            }
        }
        System.out.println(res);
    }
}

class point{

    public int x;
    public int y;

    public point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}