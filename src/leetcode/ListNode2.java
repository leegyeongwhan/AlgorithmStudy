package leetcode;


public class ListNode2 {
    public boolean deleteDuplicates(ListNode head) { //[1,1,2]
        ListNode slow = head;
        ListNode fast = head;
        if (slow == null || fast == null) {
            return false;
        }

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next; //1칸
            fast = fast.next.next; //2칸
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
