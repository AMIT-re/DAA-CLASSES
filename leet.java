// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// class Solution {
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         ListNode dummy=new ListNode();
//         ListNode cur=dummy;
//         int carry=0;
//         while(l1!=null ||l2!=null || carry!=0)
//         {
//             int sum=carry;
//             if(l1!=null)
//             {
//                 sum=sum+l1.val;
//                 l1=l1.next;
//             }
//             if(l2!=null)
//             {
//                 sum=sum+l2.val;
//                 l2=l2.next;
//             }
//             carry =sum/10;
//             cur.next=new ListNode(sum%10);
//             cur=cur.next;

            
//         }
//         return dummy.next;
        
//     }
// }
// class Solution {
//     final int MOD = 1_000_000_007;

//     public int countGoodNumbers(long n) {
//         long even = (n + 1) / 2;
//         long odd = n / 2;
//         return (int) (power(5, even) * power(4, odd) % MOD);
//     }

//     private long power(long a, long b) {
//         long result = 1;
//         a %= MOD;
//         while (b > 0) {
//             if ((b & 1) == 1)
//                 result = (result * a) % MOD;
//             a = (a * a) % MOD;
//             b >>= 1;
//         }
//         return result;
//     }
// }