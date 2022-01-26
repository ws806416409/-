package Day12;

import java.util.HashSet;

/**
 * @author lemon
 * @date 2022/1/26 21:09
 * @blog www.lemonws.top
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class LC141 {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;
        HashSet<ListNode> set = new HashSet<>();
        ListNode p = head;
        while (p.next != null) {
            if (set.contains(p)) {
               return true;
            } else {
                set.add(p);
            }
            p = p.next;
        }
        return false;
    }
}
