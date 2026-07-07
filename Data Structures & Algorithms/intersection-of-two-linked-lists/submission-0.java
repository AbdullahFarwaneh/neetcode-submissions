/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode curr = headA;
        ListNode curr2 = headB;
        int count = 0;
        int count2 = 0;
        
         
        while (curr != null) {
            count++;
            curr = curr.next;
        }

          
        while (curr2 != null) {
            count2++;
            curr2 = curr2.next;
        }

       
        curr = headA;
        curr2 = headB;

        
        if (count2 >= count) { 
            int move = count2 - count;
            while (move > 0) {
                curr2 = curr2.next;
                move--;
            }
        } else {
            int move = count - count2;
            while (move > 0) {
                curr = curr.next;
                move--;
            }
        }

        
        while (curr != null && curr2 != null) {
            if (curr == curr2) {
                return curr; 
            }
            curr = curr.next;
            curr2 = curr2.next;
        }

        return null; 
    }
}