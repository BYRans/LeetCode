#There are two sorted arrays nums1 and nums2 of size m and n respectively. 
#Find the median of the two sorted arrays. 
#The overall run time complexity should be O(log (m+n)).
import math
class Solution:
	# @param {integer[]} nums1
	# @param {integer[]} nums2
	# @return {float}
	def findMedianSortedArrays(self, nums1, nums2):
		if len(nums1) > len(nums2): #ensure nums1 shorter than nums2
			tmp = nums1
			nums1 = nums2
			nums2 = tmp
		total = nums1 + nums2
		median1 = self.getMeadian(nums1,0)
		median2 = self.getMeadian(nums2,0)
		while len(nums1) != 0:
			if median1 == median2:
				return median2
			elif median1 > median2:
				median2 = self.getMeadian(nums2,len(nums1)/2)
				nums1 = nums1[0:int(math.ceil(len(nums1)/2))]
				median1 = self.getMeadian(nums1,0)
			else: 
				median2 = self.getMeadian(nums2,-len(nums1)/2)
				nums1 = nums1[int(math.ceil(len(nums1)/2)):len(nums1)]
				median1 = self.getMeadian(nums1,0)
		print median2
		return median2

	def getMeadian(self,array,bias):
		if len(array) == 0:
			return None
		if (len(array) + bias) % 2 != 0:
			middle = (len(array) + bias) / 2
			median = (array[int(math.ceil(middle))] + array[int(math.floor(middle))]) / 2 
			print median
		elif (len(array) + bias) % 2 == 0:
			middle = (len(array) + bias) / 2
			median = (float(array[int(middle) - 1]) + float(array[int(middle)])) / 2 
		return median


array1 = [1,2,3]
array2 = [4,5,6,7,8] 
solution = Solution()
median = solution.findMedianSortedArrays(array1,array2)
print median
