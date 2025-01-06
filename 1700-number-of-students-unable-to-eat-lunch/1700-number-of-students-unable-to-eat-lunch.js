/**
 * @param {number[]} students
 * @param {number[]} sandwiches
 * @return {number}
 */
var countStudents = function(students, sandwiches) {
    let len = 0
    while(students.length){
        if(students[0] === sandwiches[0]){
            students.shift()
            sandwiches.shift()
            len = 0
        }else{
            students.push(students.shift())
            len++
            if(len === students.length) break
        }
    }
    return students.length
};