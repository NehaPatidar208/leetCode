class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals == null || intervals.length ==0) return 0;
        // sort array in increasing order of 0th index
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int l=0,r=1,n=intervals.length,count=0;
        while(r<n){
            // if l=(1,5), r=(5,6) no need to remove any of the interval
            if(intervals[l][1]<=intervals[r][0]){
                l=r;
                r+=1;
            }
            // if l= (1,6), r=(2,6) then remove the interval having value greater means remove l (1,6)
            else if(intervals[l][1] >=intervals[r][1]){
                l=r;
                r++;
                count++;
            }
            //if l=(1,6), r=(3,7) then remove the second element that is r (3,7)
            else if(intervals[l][1] < intervals[r][1]){
                r++;
                count++;
            }
        }
        return count;
        
         
        // Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        // int n=intervals.length,count=0,pre = intervals[0][1];
        // for(int i=1;i<n;i++){
        //     System.out.println(intervals[i][0] + " " + intervals[i][1]);
        //     if(pre>intervals[i][0]) count++;
        //     else pre = intervals[i][1];
        // }
        // return count;
    }
}
