class Solution {
    public void moveZeroes(int[] nums) {
        int p1=0,p2=0;
        while (p2<nums.length){
            if(nums[p2]==0){
                p2++;
                continue;
            }
            if(nums[p1]==0){
                nums[p1]=nums[p2];
                nums[p2]=0;
                
            }
            p1+=1;
            p2++;
            
        }
        
    }
}
