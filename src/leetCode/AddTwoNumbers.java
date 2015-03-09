package leetCode;

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
			ListNode first = l1;
			ListNode second = l2;
			ListNode root = new ListNode(0);
			ListNode tmp = root;
			int flag = 0;
			int digit = 0;
			while (first != null && second != null) {
				int score = first.val + second.val + flag;
				if (score >= 10)
					digit = score - 10;
				else
					digit = score;
				tmp.next = new ListNode(digit);

				if (score >= 10)
					flag = 1;
				else
					flag = 0;

				tmp = tmp.next;
				first = first.next;
				second = second.next;
			}

			ListNode remain = null;
			if (first != null) {
				remain = first;
			} else if (second != null) {
				remain = second;
			} else {
				if (flag == 1)
					tmp.next = new ListNode(1);
				return root.next;
			}

			while (remain != null) {

				int score = remain.val + flag;
				flag = 0;
				if (score >= 10)
					digit = score - 10;
				else
					digit = score;

				tmp.next = new ListNode(digit);

				if (score >= 10)
					flag = 1;
				else
					flag = 0;
				tmp = tmp.next;
				remain = remain.next;
			}

			if (flag == 1)
				tmp.next = new ListNode(1);
			return root.next;
		}
	}

}
