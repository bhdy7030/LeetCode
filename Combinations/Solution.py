class Solution:
    # @return a list of lists of integers
    def combine(self, n, k):
        comb = []
        combset = []
        if n<k:
            return combset
        self.helper(n,k,comb,combset,1)
        return combset
        
        
    def helper(self,n,k,comb,combset,start):
        if len(comb)==k:
            combset.append(comb[:])
            return
        else:
            for x in range(start,n+1):
                comb.append(x)
                self.helper(n,k,comb,combset,x+1)
                comb.pop(-1)
            
