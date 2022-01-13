class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ar[]={-1,-1};
        if(nums.length ==0 || (nums.length == 1 && nums[0] != target)) return ar;
        int f=0,l=nums.length-1;
        
        while (f<=l){
            if((nums[l]<target) || (nums[f]>target) ||(ar[0]!=-1 && ar[1]!=-1)){
                return ar;
            }
            if(nums[f]==target){
                ar[0]=f;
            }
            else if (nums[f]<target){
                f++;
            }
            if(nums[l]==target){
                ar[1]=l;
            }
            else if(nums[l]>target){
                l--;
            }
            
        }
        return ar;
    }
}
