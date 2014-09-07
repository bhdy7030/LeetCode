class Solution:
    # @return a string
    def convert(self, s, nRows):
        if nRows ==1:
            return s
        
        direction = 1
        row = 0
        temp = [[] for x in xrange(nRows)]
        
        for char in s:
            temp[row].append(char)
            if row==0:
                direction=1
            elif row == nRows-1:
                direction = -1
            
            row+=direction
            
        
        return "".join(["".join(line) for line in temp])
