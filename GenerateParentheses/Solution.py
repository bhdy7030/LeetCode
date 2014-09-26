class Solution:
    # @param an integer
    # @return a list of string
    def generateParenthesis(self, n):
        
        if n<1:
            return []
        res = []
        temp = []
        self.gen(n,0,0,res,temp)
        return res
        
    def gen(self,n,left,right,res,temp):
        if left+right == 2*n:
            res.append(''.join(temp[:]))
            return res
        else:
            if left<n:
                temp.append("(")
                self.gen(n,left+1,right,res,temp)
                temp.pop()
                
            if left>right:
                temp.append(")")
                self.gen(n,left,right+1,res,temp)
                temp.pop()
