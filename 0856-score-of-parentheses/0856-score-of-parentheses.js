/**
 * @param {string} s
 * @return {number}
 */
var scoreOfParentheses = function(S) {
    let len = S.length, pwr = 0, ans = 0
    for (let i = 1; i < len; i++)
        if (S.charAt(i) === "(") pwr++
        else if (S.charAt(i-1) === "(") ans += 1 << pwr--
        else pwr--  
    return ans
};