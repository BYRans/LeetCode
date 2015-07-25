#Write a function to find the longest common prefix string amongst an array of strings.
class Solution:
	# @param {string[]} strs
	# @return {string}
	def longestCommonPrefix(self, strs):
			prefix = ""
			if len(strs) == 0:
				return prefix
			for i in range(len(strs[0])):
				char = strs[0][i]
				for string in strs:
					if i >= len(string) or char != string[i]:
						return prefix
				prefix += char
			return prefix						
				

solution = Solution()
output = solution.longestCommonPrefix(['123','1245'])
print output