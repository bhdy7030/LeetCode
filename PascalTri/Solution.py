class Solution:
    # @return a list of lists of integers
    def generate(self, numRows):
        '''
        if numRows==0:
            return []
        if numRows==1:
            return [[1]]
        ret = [[] for x in range(numRows)]
        ret[0]=[1]
        ret[1]=[1,1]

        for i in range(2,numRows):
            temp=[]
            temp.append(1)
            for j in range(1,i):
                temp.append(ret[i-1][j]+ret[i-1][j-1])
            temp.append(1)
            ret[i]=temp

        return ret
        '''
        solution = []
        if numRows == 0:
            return solution
        actualRow = [1]
        solution.append(actualRow)
        for i in range(1,numRows):
            previousRow = actualRow
            actualRow=[1]
            for j in range(0,i-1):
                actualRow.append(previousRow[j]+previousRow[j+1])
            actualRow.append(1)
            solution.append(actualRow)
        return solution
