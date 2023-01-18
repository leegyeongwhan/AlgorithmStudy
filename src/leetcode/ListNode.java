package leetcode;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

}

class Solution {
    public ListNode deleteDuplicates(ListNode head) { //[1,1,2]
        ListNode dHead = new ListNode(Integer.MIN_VALUE);
        System.out.println(dHead);
        ListNode tmp = dHead;
        dHead.next = head;

        while (tmp != null && tmp.next != null) {
            if (tmp.val == tmp.next.val) {
                tmp.next = tmp.next.next;
            } else {
                tmp = tmp.next;
            }
        }
        return dHead.next;
    }
}
