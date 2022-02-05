package Day18;

/**
 * @author lemon
 * @date 2022/2/5 22:39
 * @blog www.lemonws.top
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class Offer18 {
    public ListNode deleteNode(ListNode head, int val) {
        if (head.val == val) head = head.next;
        ListNode p = head;
        while (p.next != null) {
            if (p.next.val == val) {
                p.next = p.next.next;
                return head;
            }
            p = p.next;
        }
        return head;
    }
}
