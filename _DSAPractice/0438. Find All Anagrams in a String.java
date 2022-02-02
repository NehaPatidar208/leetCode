class Solution {
    private boolean anagram(int ar[], int br[]){
        for (int  i =0 ; i< 26 ; i++){
            //System.out.println(ar[i] + " " + br[i]);
            if (ar[i]!=br[i]) return false;
        }
        return true;
    } 
    public List<Integer> findAnagrams(String s, String p) {
        Solution obj = new Solution();
        List<Integer> result = new ArrayList<>();
        int s_freq[] = new int[26];
        int p_freq[] = new int[26];
        int i =0 , j = 0 , s_len = s.length() , p_len = p.length();
        for(int ind = 0 ; ind < p_len ; ind++){
            p_freq[p.charAt(ind)-'a']+=1;
        }
        while(i< s_len){
            s_freq[(int)s.charAt(i)-'a']++;
            
            if(i-j+1 == p_len){
                //System.out.println("========");
                if(obj.anagram(p_freq,s_freq) == true) result.add(j);
                s_freq[(int)s.charAt(j)-'a']--;
                j++;
            }
            i++;
        }
        return result;
    }
}
