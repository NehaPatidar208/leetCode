class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer>ls=new ArrayList<>();
        int i,f=0,s=0,t=1;
        Arrays.sort(nums);
        for(i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1] || nums[i]==-1){
                nums[i]=-1;
            }
        }
        while(s<nums.length){
            if(nums[s]==-1){s++;continue;}
            else if (nums[f]==-1) {
                nums[f]=nums[s];
                nums[s]=-1;
            }
            s++;
            f++;
            
        }
        for(i=0;i<nums.length-ls.size();){
            if(nums[i]!=i+t){
                ls.add(i+t);
                t++;
                
            }else{
                i++;
            }
        }
        return ls;
        
    }
}
