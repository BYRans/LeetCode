class Solution:
	# @param {integer} x
	# @return {boolean}
	def isPalindrome(self, x):
		palindrome = 0
		tmpx = x
		while  x > 0:
			palindrome = palindrome*10 + x%10
			x /= 10
		if palindrome == tmpx:
			return True
		else:
			return False