/**
 * @param {string} word
 * @param {character} ch
 * @return {string}
 */
var reversePrefix = function(word, ch) {
    let arr = []
    for(let s of word){
        if(s !== ch){
            arr.push(s)
        }else {
            arr.push(s)
            return arr.reverse().join("") + word.substring(word.indexOf(s) + 1)
        }
    }
    return word
};