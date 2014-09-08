class Solution:
    # @param num, a list of integer
    # @return an integer
    def longestConsecutive(self, num):
        if not num:
            return 0
        ret = 1
        dic = set(num)
        
        for i in num:
            count = 1
            left  = i-1
            right = i+1
            while left in dic:
                count+=1
                dic.remove(left)
                left-=1
            
            while right in dic:
                count+=1
                dic.remove(right)
                right+=1
            ret = max(ret,count)
        
        return ret