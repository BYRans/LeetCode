package leetCode;

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
			if (s == null || s.equals(""))
				return 0;
			HashSet<String> charSet = new HashSet<String>();
			s = s + s.charAt(s.length() - 1);
			char[] cArr = s.toCharArray();
			int max = 0;
			for (int i = 0; i < cArr.length; i++) {
				int tmp = 0;
				for (int j = i; j < cArr.length; j++) {
					if (!charSet.contains(cArr[j] + "")) {
						tmp++;
						charSet.add(cArr[j] + "");
					} else {
						if (tmp > max)
							max = tmp;
						tmp = 1;
						charSet.clear();
					}
				}
			}

			return max;
		}
	}
}
