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
				String c = cArr[i] + "";
				if (!map.containsKey(c)) {
					map.put(c, i);
				} else {
					int index = map.get(c);
					map.put(c, i);
					if (i - begin > max)
						max = i - begin;
					if (index + 1 > begin)
						begin = index + 1;
				}
			}
			if (cArr.length - begin > max)
				max = cArr.length - begin;

			return max;
		}
	}
}
