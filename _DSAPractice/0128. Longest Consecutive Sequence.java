class Solution {
    public int longestConsecutive(int[] nums) {
      // TC = O(N)
      // SC = O(N)
        int res=0,count;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int i:set){
            if(!set.contains(i-1)){
                int curEle=i;
                count=1;
                while(set.contains(curEle+1)){
                    count++;
                    curEle++;
                }
                res=Math.max(res,count);
            }
        }
        return res;
      
      /*
       //TC= O(NlogN)
       //SC= O(1)
        int res=0,count;
        if(nums.length <2)return nums.length;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1])continue;
            if(nums[i]!=nums[i-1]+1){
                res=Math.max(res,count);
                count=1;
            }
            else count++;
        }
        return Math.max(res,count);
        
        */
    }
}
