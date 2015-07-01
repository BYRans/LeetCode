package leetCode;

/**
 * @author Ransford TODO Implement atoi to convert a string to an integer.
 * 
 *         Hint: Carefully consider all possible input cases. If you want a
 *         challenge, please do not see below and ask yourself what are the
 *         possible input cases.
 * 
 *         Notes: It is intended for this problem to be specified vaguely (ie,
 *         no given input specs). You are responsible to gather all the input
 *         requirements up front.
 */
public class StringToInteger {

	public class Solution {
		public int myAtoi(String str) {
			str = str.trim();
			int flag = 1;
			long result = 0;
			if (str.startsWith("-")) {
				flag = -1;
				str = str.substring(1);
			} else if (str.startsWith("+")) {
				str = str.substring(1);
			}
			for (char c : str.toCharArray()) {
				if (c < '0' || c > '9')
					break;
				result = result * 10 + (c - '0');
				if (flag > 0 && flag * result > Integer.MAX_VALUE)
					return Integer.MAX_VALUE;
				else if (flag < 0 && flag * result < Integer.MIN_VALUE)
					return Integer.MIN_VALUE;
			}
			return (int) result * flag;
		}
	}
}
