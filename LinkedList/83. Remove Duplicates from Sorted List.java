/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null)
          return head;
          ListNode temp=head;     //定义temp结点来作为指针
          while(temp.next!=null)
         {
             if(temp.val==temp.next.val)
                 temp.next=temp.next.next; //当前结点值与下一结点值相同则指向下一节点的下一节点
             else
                 temp=temp.next; //否则temp后移
         }
          return head;        //head指针没有动过，但是后面的指针已经由temp修改了
    }
}