/**
 * @param {string} s
 * @return {string}
 */
var removeStars = function(s) {
    let result = []
    for(let x of s){
        if(x !== "*"){
            result.push(x)
        }else {
            result.pop()
        }
    }
    return result.join("")
    
};