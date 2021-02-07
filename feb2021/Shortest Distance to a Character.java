/*
Input1: s = "loveleetcode", c = "e"
Output1: [3,2,1,0,1,0,0,1,2,2,1,0]

Input2: s = "aaab", c = "b"
Output2: [3,2,1,0]
*/

class Solution {
    public int[] shortestToChar(String s, char c) {
        int left[]=new int[s.length()], right[]=new int[s.length()],i,mx=Integer.MAX_VALUE,result[]=new int[s.length()];
        
        boolean visit=false;
        
        for(i=0;i<s.length();i++){
            if(!visit){
                if(s.charAt(i)==c){
                    left[i]=0;
                    visit=true;
                }else{
                    left[i]=mx;
                }
            }else if(s.charAt(i)==c){
                left[i]=0;
            }else{
                left[i]=left[i-1]+1;
            }
           
        }
        visit=false;
        for(i=s.length()-1;i>=0;i--){
            if(!visit){
                if(s.charAt(i)==c){
                    right[i]=0;
                    visit=true;
                }else{
                    right[i]=mx;
                }
            }else if(s.charAt(i)==c){
                right[i]=0;
            }else{
                right[i]=right[i+1]+1;
            }
        }
        for(i=0;i<s.length();i++){
            result[i]=Math.min(left[i],right[i]);
        }
        return result;
        
    }
}
