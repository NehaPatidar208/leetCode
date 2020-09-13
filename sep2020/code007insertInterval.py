class Solution:
    def insert(self, intervals: List[List[int]], newInterval: List[int]) -> List[List[int]]:
        if len(newInterval)==0 :
            return intervals
        if len(intervals)==0:
            return [newInterval]
        f=0
        tmp=[]
        for i in range (len(intervals)):
            if newInterval[0]<=intervals[i][-1] and newInterval[1]>=intervals[i][0]:
                f=1
                if len(tmp)==0 or tmp[-1][-1]<min(newInterval[0],intervals[i][0]):
                    tmp.append([min(newInterval[0],intervals[i][0]),max(newInterval[1],intervals[i][1])])
                elif tmp[-1][-1]>=intervals[i][0] and tmp[-1][0]<=intervals[i][1]:
                    tmp[-1][0]=min(tmp[-1][0],intervals[i][0])
                    tmp[-1][1]=max(tmp[-1][1],intervals[i][1])
            else:
                tmp.append(intervals[i])
        if f==0:
            tmp.append(newInterval)
        tmp.sort()
        return tmp
