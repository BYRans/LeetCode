#Reverse digits of an integer.
#Example1: x = 123, return 321
#Example2: x = -123, return -321
class Solution:
	# @param {integer} x
	# @return {integer}
	def reverse(self, x):
		while x%10 == 0 and x != 0:
			x /= 10
		if x >= 0:
			xStrReverse = str(x)[::-1]
			xReverse = int(xStrReverse)
			if xReverse > 2147483647:
				return 0
			return xReverse
		else:
			xStrReverse = str(x)[:0:-1]
			xReverse = -int(xStrReverse)
			if xReverse < -2147483648:
				return 0
			return xReverse


solution = Solution()
result = solution.reverse(-10)
print result