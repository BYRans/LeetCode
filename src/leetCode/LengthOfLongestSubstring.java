package LeetCode.src.leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

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
			if ("".equals(s.length()))
				return 0;
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			char[] cArr = s.toCharArray();
			int max = 0;
			int begin = 0;
			for (int i = 0; i < cArr.length; i++) {
				if (map.get(cArr[i] + "") == null) {
					map.put(cArr[i] + "", 0);
				} else
					map.put(cArr[i] + "", map.get(cArr[i] + "") + 1);

				while (map.get(cArr[i] + "") >= 1) {
					map.put(cArr[i] + "", map.get(cArr[i] + "") - 1);
					begin++;
				}
				if (i - begin + 1 > max)
					max = i - begin + 1;
			}
			
			return max;
		}
	}
}
