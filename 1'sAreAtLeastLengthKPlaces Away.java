class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int i,tmp=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]==0){
                tmp++;
            }
            else{
                if((i!=0) && tmp<k){
                    return false;
                }else{
                    tmp=0;
                }
            }
        }
        return true;
        
    }
}
