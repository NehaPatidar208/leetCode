class Solution {
    public int minDeletions(String s) {
        Set<Integer> st = new HashSet<>();
        int result=0;
        int ar[] = new int[26];
        for(int i=0;i<s.length();i++){
            ar[s.charAt(i) -'a']++;
        }
        for(int i=0;i<26;i++){
            if(st.isEmpty() ||!st.contains(ar[i])){
                st.add(ar[i]);
            }
            else{
                while(st.contains(ar[i]) && ar[i] !=0){
                    ar[i]--;
                    result++;
                }
                st.add(ar[i]);
            }
        }
        return result;
    }
}
