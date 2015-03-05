package leetCode;

import leetCode.TwoSum.Solution;

/**
 * @author Ransford TODO
 */
public class runTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { 3,2,4 };
		int target = 6;

		TwoSum twoSum = new TwoSum();
		Solution solution = twoSum.new Solution();

		int[] score = solution.twoSum(numbers, target);

		System.out.println(score[0]+"  "+score[1]);
		
	}

}
