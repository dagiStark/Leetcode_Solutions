class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        store = []
        if len(tokens) == 1: return int(tokens.pop())
        for i in tokens:
            if i == "/" or i == "-" or i =="+" or i=="*":
                a, b = int(store.pop()), int(store.pop())
                if a != 0: n = int(b/a)
                opr = {"/" : n , "-":b - a, "+":b +a, "*":b *a}
                store.append(opr.get(i))
            else:
                store.append(i)
        return store.pop()