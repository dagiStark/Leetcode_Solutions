class Solution:
    def nextGreaterElement(self, nums1: List[int], nums2: List[int]) -> List[int]:
        ans = []
        for i in nums1:
            sum = 0
            n = nums2.index(i)
            if n == len(nums2) - 1:
                ans.append(-1)
            else:
                for x in range(n + 1, len(nums2)):
                    if nums2[x] > i:
                        ans.append(nums2[x])
                        sum +=1
                        break
                if sum == 0: ans.append(-1)    
                
        return ans