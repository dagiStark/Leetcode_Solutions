/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function(s) {
    const map = {
        "]" : "[",
        "}" : "{",
        ")" : "("
    } 
    const checker = ["[", "{", "("]
    let items = []
    for (let i = 0; i < s.length; i++){
        if(checker.includes(s.charAt(i))){
            items.push(s.charAt(i))
        } else {
            if (items.pop() !== map[s.charAt(i)]) return false
        }
    }
    return items.length === 0
};