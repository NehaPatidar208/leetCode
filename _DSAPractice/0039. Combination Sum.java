class Solution {
    void helper(int []candidates, int ind, int target, List<List<Integer>> result, int n, List<Integer> ds){
        if( ind == n){
            if(target == 0){
                result.add(new ArrayList<>(ds));
            }
            return;
        }
        if(target >= candidates[ind]){
            ds.add(candidates[ind]);
            helper(candidates, ind, target-candidates[ind],result,n,ds);
            ds.remove(ds.size()-1);
        }
        helper(candidates, ++ind, target,result,n,ds);
        
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        helper(candidates, 0, target, result, candidates.length, new ArrayList<Integer>());
        return result;
    }
}
