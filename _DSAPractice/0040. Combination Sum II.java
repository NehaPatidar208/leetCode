class Solution {
    void helper(int ind, int ar[],int target, List<List<Integer>> result, int n, ArrayList<Integer>ds){
        if(target == 0){
            result.add(new ArrayList<Integer>(ds));
        }
        for(int i=ind;i<n;i++){
            if(i>ind && ar[i]==ar[i-1])continue;
            if(target < ar[i])break;
            ds.add(ar[i]);
            helper(1+i, ar, target-ar[i],result,n,ds);
            ds.remove(ds.size()-1);
        }
    }
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result= new  ArrayList<List<Integer>>();
        helper(0, candidates, target, result, candidates.length ,new ArrayList<Integer>());
        return result; 
    }
}
