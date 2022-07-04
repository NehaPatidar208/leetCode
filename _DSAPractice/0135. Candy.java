class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length,sum=0;
        int []ar1 = new int[n];
        Arrays.fill(ar1,1);
        for(int i =1;i<n;i++){
            if(ratings[i]> ratings[i-1]){
                ar1[i] = ar1[i-1]+1;
            }
        }
        for(int i =n-2;i>=0;i--){
            if(ratings[i]> ratings[i+1]){
                if(ar1[i]<=ar1[i+1])
                    ar1[i] = ar1[i+1]+1;
            }
        }
        for(int i=0;i<n;i++){
            sum+=ar1[i];
        }
        return sum;
    }
}
