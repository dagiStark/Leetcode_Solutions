/**
 * @param {string} path
 * @return {string}
 */
var simplifyPath = function(path) {
    let strayed = path.split("/")
    let result = []
    strayed.forEach((item) => {
        if(item === ".."){
            result.pop()
        }else if(item !== "." && item !== ""){
            result.push(`/${item}`)
        }
    })
    if(result.length === 0) result.push("/")
    return result.join("")
};