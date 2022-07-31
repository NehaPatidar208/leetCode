class NumArray {
    int nums[];
    int b[];
    int len;
    public NumArray(int[] nums) {
        this.nums = nums;
        len = (int) Math.ceil(nums.length/Math.sqrt(nums.length));
        b=new int[len];
        for(int i=0;i<nums.length;i++){
            b[i/len] +=nums[i];
        }
    }
    
    public void update(int index, int val) {
        this.b[index/this.len]=this.b[index/this.len]-this.nums[index]+val;
        nums[index]=val;
    }
    
    public int sumRange(int left, int right) {
        int res=0;
        int sBlock = left/len;
        int eBlock = right/len;
        if(sBlock == eBlock){
            for(int i=left;i<=right;i++){
                res+=this.nums[i];
            }
        }
        else{
            for(int i=left;i<(sBlock+1)*len;i++){
                res+=nums[i];
            }
            for(int i=sBlock+1;i<eBlock;i++){
                res+=b[i];
            }
            for(int i= (eBlock*len);i<=right;i++){
                res+=nums[i];
            }
        }
        
        return res;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */
