class Solution {
    public int maxSumSubmatrix(int[][] matrix, int k) {
        int m=matrix.length, n=matrix[0].length,result=Integer.MIN_VALUE;
        for(int i=0;i<m;i++){
            for(int j=1;j<n;j++){
                matrix[i][j] +=matrix[i][j-1];
            }
        }
        
        for(int i=0;i<n;i++){
            //System.out.println("\n i ="+i);
            for(int j=i;j<n;j++){
                TreeSet<Integer> set = new TreeSet<>();
                set.add(0);
                int prefixSum=0;
                for(int r=0;r<m;r++){
                    prefixSum+=matrix[r][j] - (i>0?matrix[r][i-1]:0);
                    Integer target = set.ceiling(prefixSum - k);
                    //System.out.println("ceiling(prefixSum - k)"+set.ceiling(prefixSum - k) + " floor(prefixSum-k) " + set.floor(prefixSum-k));
                    if(target!=null){
                        result = Math.max(result,prefixSum - target);
                    }
                    set.add(prefixSum);
                    //System.out.println("result = "+result + " prefixSum "+ prefixSum);
                }
            }
        }
        return result;
            
    }
}
