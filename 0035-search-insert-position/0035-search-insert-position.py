class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        nums.append(float('inf'))
        low, upp =0, len(nums) -1
        while( low < upp):
            mid = (low + upp)//2
            if (target <= nums[mid]):
                upp = mid
            else: low = mid + 1
        return low