class Solution:
    # @param s, a string
    # @return an integer
    def lengthOfLastWord(self, s):
        if not s or len(s)==0:
            return 0

        if len(s)<=1:
            return 0 if s==" " else 1

        wordCount=0
        flag=False
        for i in xrange(0,len(s)):
            if s[i]==" ":
                flag =True
            if s[i]!=" ":
                if flag==True:
                    wordCount=0
                wordCount+=1
                flag = False

        return wordCount
        # return len(s.split()[len(s.split())-1]) if s.split()!=[] else 0
