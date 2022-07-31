class Solution {
    public int trap(int[] height) {
        if(height.length<3)return 0;
        int result = 0, n = height.length;
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];
        leftMax[0]=height[0];
        rightMax[n-1] = height[n-1];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }
        for(int i=1;i<n-1;i++){
            result+= Math.min(leftMax[i],rightMax[i])- height[i];
        }
        return result;
    }
}
