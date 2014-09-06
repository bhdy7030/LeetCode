# Definition for an interval.
# class Interval:
#     def __init__(self, s=0, e=0):
#         self.start = s
#         self.end = e

class Solution:
    # @param intervals, a list of Interval
    # @return a list of Interval
    def merge(self, intervals):
        if not intervals:
            return []
        intervals.sort(key = lambda x:x.start)
        res = []
        Start=End=prev=None
        for cur in intervals:
            if prev:
                if cur.start<=End:
                    End = max(cur.end,End)
                else:
                    res.append(Interval(Start,End))
                    Start = cur.start
                    End = cur.end
            else:
                Start = cur.start
                End = cur.end
            prev = cur
        res.append(Interval(Start,End))
        return res
        
