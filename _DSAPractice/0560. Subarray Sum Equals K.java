class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int result = 0, tmp = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            tmp+=nums[i];
            if(map.containsKey(tmp-k)){
                result+=map.get(tmp-k);
            }
            map.put(tmp, map.getOrDefault(tmp,0)+1);
        }
        return result;
    }
}
