class Solution:
    # @return a string
    def longestCommonPrefix(self, strs):
        if not strs:
            return ""
        prefix = []
        i=0
        while True:
            if i==len(strs[0]):
                break
            c = strs[0][i]
            x=1
            while  x<len(strs):
                if i ==len(strs[x]):
                    break
                if c!=strs[x][i]:
                    break
                x+=1
            
            if x!=len(strs):
                break
            prefix.append(c)
            i+=1
        return "".join(prefix)
        
