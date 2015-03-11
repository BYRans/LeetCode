package leetCode;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author Ransford TODO Given a string, find the length of the longest
 *         substring without repeating characters. For example, the longest
 *         substring without repeating letters for "abcabcbb" is "abc", which
 *         the length is 3. For "bbbbb" the longest substring is "b", with the
 *         length of 1.
 */
public class LengthOfLongestSubstring {
	public class Solution {
		public int lengthOfLongestSubstring(String s) {
			HashSet<String> charSet = new HashSet<String>();
			int[] arr = new int[s.length()];
			for (int i = 0; i < s.length(); i++) {
				if (!charSet.contains(s.charAt(i) + "")) {
					charSet.add(s.charAt(i) + "");
					arr[i] = 1;
				} else
					arr[i] = 0;
			}
			int max = 0;
			int count = 0;
			for (int n : arr) {
				if (n == 1)
					count++;
				else {
					if (count > max) {
						max = count;
						count = 1;
					}
				}
			}
			
			if (count > max)
				max = count;
			return max;
		}
	}
}
