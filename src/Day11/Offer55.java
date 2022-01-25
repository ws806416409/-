package Day11;

/**
 * @author lemon
 * @date 2022/1/25 19:50
 * @blog www.lemonws.top
 */
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}
public class Offer55 {
    static int maxn = 0;
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return Math.max(maxDepth(root.left) + 1, maxDepth(root.right) + 1);
    }
}
