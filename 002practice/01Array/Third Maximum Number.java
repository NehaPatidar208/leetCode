class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int i,sm=1;
        for(i=nums.length-2;i>=0;i--){
            if(nums[i]!=nums[i+1]){
                sm+=1;
                if(sm==3){
                    return nums[i];
                }
            }
        }
        return nums[nums.length-1];
        
    }
}
