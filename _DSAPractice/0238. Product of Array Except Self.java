class Solution {
    public int[] productExceptSelf(int[] nums) {
        int result=1,countOfZero = 0;
        int res[]= new int[nums.length];
        for(int n:nums){
            if(n == 0){
                countOfZero++;
            }else{
                result *= n;
            }
        }
        if(countOfZero >1)return res;
        for(int i=0;i<nums.length;i++){
            if(countOfZero == 1){
                if(nums[i]==0){
                    res[i]=result;
                }
            }else{
                res[i] = result / nums[i];
            }
        }
        return res;
    }
}
