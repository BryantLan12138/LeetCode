// import ListNode Class
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) {
            return null;
        }
        else if(l1 == null) {
            return l2;
        }
        else if(l2 == null) {
            return l1;
        }

        ListNode node = new ListNode();
        ListNode result = node;

        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                node.next = l1;
                l1 = l1.next;
            }
            else {
                node.next = l2;
                l2 = l2.next;
            }
            node = node.next;
        }

        if(l1 == null) {
            node.next = l2;
        }
        if(l2 == null) {
            node.next = l1;
        }

        return result.next;
    }
}
