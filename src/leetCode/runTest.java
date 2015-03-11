package leetCode;

import leetCode.AddTwoNumbers;
import leetCode.AddTwoNumbers.Solution;
import leetCode.AddTwoNumbers.ListNode;

/**
 * @author Ransford TODO
 */
public class runTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] numbers = { 3, 2, 4 };
//		int target = 6;
		
		AddTwoNumbers ln = new AddTwoNumbers();
		Solution solution = ln.new Solution();

		
		// Input: (2 -> 4 -> 3) + (5 -> 6 -> 4) Output: 7 -> 0 -> 8
		ListNode root1 = ln.new ListNode(3);
		root1.next = ln.new ListNode(7);
//		root1.next.next = ln.new ListNode(1);

		ListNode root2 = ln.new ListNode(9);
		root2.next = ln.new ListNode(2);
//		root2.next.next = ln.new ListNode(4);

		ListNode score = solution.addTwoNumbers(root1, root2);

		while (score != null){
			System.out.print(score.val + "-->");
			score = score.next;
		}
	}

}
