package LeetCode.src.leetCode;

/**
 * @author Ransford TODO You are given two linked lists representing two
 *         non-negative numbers. The digits are stored in reverse order and each
 *         of their nodes contain a single digit. Add the two numbers and return
 *         it as a linked list.
 * 
 *         Input: (2 -> 4 -> 3) + (5 -> 6 -> 4) Output: 7 -> 0 -> 8
 */

public class AddTwoNumbers {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public class Solution {
		public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
			ListNode root = new ListNode(0);
			ListNode tmp = root;
			int score = 0;
			while (l1 != null || l2 != null) {
				if(l1 != null){
					score += l1.val;
					l1 = l1.next;
				}
				
				if(l2 != null){
					score += l2.val;
					l2 = l2.next;
				}
				
				tmp.next = new ListNode(score % 10);
				tmp = tmp.next;
				score /= 10;
			}

			if (score == 1)
				tmp.next = new ListNode(1);
			return root.next;
		}
	}

}
