#Reverse digits of an integer.
#Example1: x = 123, return 321
#Example2: x = -123, return -321
class Solution:
	# @param {integer} x
	# @return {integer}
	def reverse(self, x):
		flag = 1
		result = 0
		if x < 0:
			flag = -1
			x = -x
		while x != 0:
			result = result*10 + x%10
			x /= 10
		if result > 2147483647 or result < -2147483648: 
			return 0
		return flag * result



solution = Solution()
result = solution.reverse(-12)
print result