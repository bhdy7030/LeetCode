__author__ = 'yuandu'

class Solution:
    def threeSum(self, num):
        if not num:
            return 0
        Solution.ret=[]
        num.sort()
        self.DFS(num,0,0,[],0)
        return Solution.ret

    def DFS(self,num,start,step,templist,target):
        if step==3:
            if target==0 and sorted(templist) not in Solution.ret:
                Solution.ret.append(templist)
            return
        for i in xrange(start,len(num)):
            if target<num[i]:
                return
            newnum = num[:]
            newnum.pop(i)
            self.DFS(newnum,start+1,step+1,templist+[num[i]],target-num[i])
