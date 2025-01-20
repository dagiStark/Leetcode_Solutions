/**
 * @param {number[]} nums
 * @return {number[]}
 */
var nextGreaterElements = function(nums) {
    let ans = []
    for(let i = 0; i < nums.length; i++){
        let j = i +1
        while(i !== j){
            j = j % nums.length
            if(nums[j] > nums[i]){ ans.push(nums[j]); break}
            j++
        }
        if(i === j) ans.push(-1)
    }
    return ans
};