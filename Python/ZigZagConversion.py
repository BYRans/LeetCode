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
		divisor = (2*numRows - 2)
		numColumns = 1
		numGroups = 1
		if divisor > 0:
			numGroups = len(s) / (2*numRows - 2) + 1
			numColumns = (len(s) / (2*numRows - 2) + 1)* (numRows - 1) 
		myList = [([' ']*numColumns) for i in range(numRows)]
		index = 0
		column = 0
		result = ''
		for group in range(numGroups):
			for row in range(numRows):
				if index == len(s):
					break
				myList[row][column] = s[index]
				index += 1
			for row in range (numRows-2,0,-1):
				if index == len(s):
					break
				column += 1
				myList[row][column] = s[index]
				index += 1
			column += 1
		for row in myList:
			for code in row:
				if code != ' ':
					result += code
		return result

solution = Solution()
result = solution.convert('ABCDE',4)
print result	
