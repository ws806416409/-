package Day10;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author lemon
 * @date 2022/1/21 22:35
 * @blog www.lemonws.top
 */
public class A1904 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            in.nextInt(); int v = in.nextInt();
            while(!stack.isEmpty() && v < stack.peek()){
                stack.pop();
            }
            stack.push(v);
        }
        System.out.println(stack.size());
    }
}
