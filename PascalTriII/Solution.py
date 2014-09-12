class Solution:
    # @return a list of integers
    def getRow(self, rowIndex):
        if rowIndex == 0:
            return [1]
        actualRow = [1]
        for i in range(1,rowIndex+1):
            previousRow = actualRow
            actualRow=[1]
            for j in range(0,i-1):
                actualRow.append(previousRow[j]+previousRow[j+1])
            actualRow.append(1)
        return actualRow
