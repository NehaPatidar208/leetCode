class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int result = 0;
        Set<Character> vowels = new HashSet<Character>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        for(int i = left;i <= right && i < words.length ; i++){
            if(vowels.contains(words[i].charAt(0)) && vowels.contains(words[i].charAt(words[i].length()-1))) result++;
        }
        return result;
    }
}
