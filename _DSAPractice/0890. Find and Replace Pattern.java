class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            Map<Character,Character>pat_wrd = new HashMap<>();
            Map<Character,Character>wrd_pat = new HashMap<>();
            if(words[i].length() != pattern.length())continue;
            boolean flag = true;
            for(int j=0;j<pattern.length();j++){
                char w =words[i].charAt(j);
                char p = pattern.charAt(j);
                if(!pat_wrd.containsKey(p) && !wrd_pat.containsKey(w)){
                    pat_wrd.put(p,w);
                    wrd_pat.put(w,p);
                }
                else if(!pat_wrd.containsKey(p) || !wrd_pat.containsKey(w) || pat_wrd.get(p) != w || wrd_pat.get(w)!=p) {
                    flag = false;
                    break;
                }
            }
            if(flag){
                result.add(words[i]);
            }
        }
        return result;
    }
}
