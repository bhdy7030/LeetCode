class Solution:
    # @param matrix, a list of lists of integers
    # @param target, an integer
    # @return a boolean
    def searchMatrix(self, matrix, target):
        if not matrix or not matrix[0] or len(matrix[0])==0:
            return False
        m = len(matrix)
        n = len(matrix[0])
        start = 0
        end = m*n -1
        while start<=end:
            mid = (start + end)/2
            midX = mid/n
            midY = mid%n
            if matrix[midX][midY]==target:
                return True
            if matrix[midX][midY]<target:
                start = mid+1
            else:
                end = mid-1
        return False
