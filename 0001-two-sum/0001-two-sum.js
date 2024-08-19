/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    const newMap = {}
    for(let i =0; i<nums.length; i++){
        const diff = target - nums[i]
        if(diff in newMap) return [i, newMap[diff]]
        newMap[nums[i]] = i
    }
};