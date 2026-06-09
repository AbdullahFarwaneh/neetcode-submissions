/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
 ListNode dummy =new ListNode(0);
ListNode tail =dummy ;
ListNode pointer1 = list1 ;
ListNode pointer2 =list2;

 while(pointer1!=null && pointer2!=null){
if (pointer1.val<=pointer2.val){

    tail.next=pointer1 ;
    pointer1=pointer1.next;
    tail=tail.next;
}
else {

  tail.next=pointer2;
    pointer2 =pointer2.next;
    tail=tail.next;
}

 

 }

 if(pointer1==null){
    tail.next=pointer2;
 }
 else {
   tail.next=pointer1 ;
 }
 return dummy.next;
    }
}