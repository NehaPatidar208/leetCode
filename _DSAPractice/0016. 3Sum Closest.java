class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int i = 0,n = nums.length, low, high;
        int result = nums[0] + nums[1] + nums[n-1];
        while(i < n - 2){
            if(i == 0 || (i > 0 && nums[i] != nums[i-1])){
                low= i+1;
                high=n-1;
                while(low < high){
                    int temp = nums[i]+nums[low]+nums[high];
                    if (Math.abs(temp - target) < Math.abs(result - target)) {
                        result = temp;
                    }
                    if(temp > target) high--;
                    else low++;
                }
            }
            i++;
        }
        return result;
    }
}
