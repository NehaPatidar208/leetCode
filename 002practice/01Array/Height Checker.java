class Solution {
    public int heightChecker(int[] heights) {
        int ar[]=new int[heights.length],a=0,i;
        for(i=0;i<ar.length;i++)ar[i]=heights[i];
        Arrays.sort(ar);
        for(i=0;i<ar.length;i++){
            if(ar[i]!=heights[i]){
                a++;
            }
        }
        return a;
        
    }
}
