class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        index = -1
        stack = []
        for num in nums:
            if num not in stack:
                index += 1
                nums[index] = num
                stack.append(num)
        return len(stack)
