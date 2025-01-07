/**
 * @param {string} s
 * @return {string}
 */
var makeGood = function(s) {
    let ans = []
    for(let x of s){
        if(ans.length === 0){
            ans.push(x)
        }else{
            if(x.toLowerCase() === ans[ans.length-1].toLowerCase()){
                if(x !== ans[ans.length -1]){
                    ans.pop()
                }else{
                ans.push(x)
                }
            }else {
                ans.push(x)

            }
        }
    }
    return ans.join("")
};