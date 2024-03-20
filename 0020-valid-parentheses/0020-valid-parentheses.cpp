#include<iostream>
#include<stack>
#include<map>
using namespace std;

class Solution {
public:
    bool isValid(string s) {
        map<char, char> store = {{ ')', '('}, {']', '['}, {'}', '{'}};
        stack<char> values;

        if(s[0] == ']' || s[0] == '}' || s[0] == ')') return false;

        for (int i = 0; i< s.length(); i++){
            if(s[i] == '{' || s[i] == '(' || s[i] == '['){
                values.push(s[i]);
            }else{
                if(!values.empty() && values.top() == store.at(s[i])){
                    values.pop();
                }else return false;
            }
        }
        return values.empty();
    }
};