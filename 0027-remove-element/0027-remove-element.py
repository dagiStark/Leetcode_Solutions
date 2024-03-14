class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        index = -1
        counter = 0
        for num in nums:
            if num != val:
                index +=1
                nums[index] = num
                counter +=1
        return counter