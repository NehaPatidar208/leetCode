class Solution {
    boolean helper(int ar1[],int ar2[]){
        for(int i=0;i<26;i++){
            if(ar1[i]!=0 && ar1[i]>ar2[i])return false;
        }
        return true;
    }
    public int[] count(String S) {
        int[] ans = new int[26];
        for (char c: S.toCharArray())
            ans[c - 'a']++;
        return ans;
    }
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> result = new ArrayList<>();
        int ar1[] = count("");
        for(String s:words2){
            int []sCount = count(s);
            for(int i=0;i<26;i++){
                ar1[i] = Math.max(ar1[i],sCount[i]);
            }
        }
        for(int i=0;i<words1.length;i++){
            int arr2[] = count(words1[i]);
            if(helper(ar1,arr2)){
                result.add(words1[i]);
            }
        }
        return result;
    }
    
}
