class Solution {
    public String getHint(String secret, String guess) {
        int []s = new int[10];
        int []g = new int[10];
        for(int i=0;i<secret.length();i++){
            s[secret.charAt(i)-'0']++;
            g[guess.charAt(i)-'0']++;
        }
        int cow=0,bull=0;
        for(int i=0;i<guess.length();i++){
            char sChar = secret.charAt(i),gChar =guess.charAt(i);
            if(sChar==gChar){
                s[sChar-'0']--;
                g[gChar-'0']--;
                cow++;
            }
        }
        for(int i=0;i<10;i++){
            bull+=Math.min(s[i],g[i]);
        }
        
        return (String.valueOf(cow)+"A"+String.valueOf(bull)+"B");
    }
}
