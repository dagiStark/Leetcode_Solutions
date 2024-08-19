/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function(s) {
    let left = 0
    let right = 0
    let maxLength = 0
    const hashSet = new Set();
    while(right < s.length){
        if(!hashSet.has(s[right])){
            hashSet.add(s[right])
            maxLength = Math.max(maxLength, right - left + 1)
            right++
        }else {
            hashSet.delete(s[left])
            left++
        }
    }

    return maxLength
};