package LeetCode.src.leetCode;

import LeetCode.src.leetCode.LengthOfLongestSubstring;
import LeetCode.src.leetCode.LengthOfLongestSubstring.Solution;

/**
 * @author Ransford TODO
 */
public class RunTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LengthOfLongestSubstring test = new LengthOfLongestSubstring();
		Solution solution = test.new Solution();
		String s = "abba";
		int score = solution.lengthOfLongestSubstring(s);

		System.out.print(score);
	}

}
