class Solution:
    # @param candidates, a list of integers
    # @param target, integer
    # @return a list of lists of integers
    def combinationSum2(self, candidates, target):
        candidates.sort()
        Solution.ret = []
        self.DFS(candidates,target,0,[])
        return Solution.ret
        
    def  DFS(self,candidates,target,start,templist):
        length = len(candidates)
        if target==0 and templist not in Solution.ret:
            Solution.ret.append(templist)
            return
        for i in xrange(start,length):
            if target<candidates[i]:
                return
            self.DFS(candidates,target-candidates[i],i+1,templist+[candidates[i]])
            
        
