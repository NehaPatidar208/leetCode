class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char result = letters[0];
        for(int i=1;i<letters.length;i++){
            if(letters[i]>target){
                if(result <=target){
                    result = letters[i];
                }
            }else if(result > letters[i]){
                result = letters[i];
            }
        }
        return result;
    }
}
