class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        for i in s:
            if not stack and ((i == ")" or i == "}") or i == "]"): return False
            if i == "(" or i == "{" or i == "[":
                stack.append(i)
            else:
                if i == "]" and stack.pop() != "[" :
                     return False
                elif i == "}" and stack.pop() != "{":
                     return False
                elif i == ")" and stack.pop() != "(":
                     return False
                    

                
        return not stack