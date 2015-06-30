#ZigZag Conversion 
#The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
#And then read line by line: "PAHNAPLSIIGYIR"
#Write the code that will take a string and make this conversion given a number of rows:
#convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
class Solution:
	# @param {string} s
	# @param {integer} numRows
	# @return {string}
	def convert(self, s, numRows):
		if numRows == 1:
			return s
		step = 2 * numRows - 2
		result = ''
		result += s[::step]
		for i in range(1,numRows-1):
			for j in range(i,len(s),step):
				result += s[j]
				if j+(step - i*2) < len(s):
					result += s[j+(step - i*2)]
		result += s[numRows-1::step]
		return result

solution = Solution()
result = solution.convert('ABC',3)
print result	
	