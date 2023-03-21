class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long res=0;
        int count =0;
        for(int i : nums){
            if(i == 0){
                count++;
                res+= count;
            }else{
                count=0;
            }
        }
        return res;
    }
}
