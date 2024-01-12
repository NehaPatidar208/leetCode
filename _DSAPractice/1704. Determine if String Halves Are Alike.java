class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length(), f=0,l=0;
        Character ar[]={'a','e','i','o','u','A','I','E','O','U'};
        Set<Character> vowel = new HashSet<>(Arrays.asList(ar));
        for(int i=0,j=(n/2);j<n;i++,j++){
            //System.out.println(s.charAt(i) + " " +s.charAt(j));
            if(vowel.contains(s.charAt(i)))f++;
            if(vowel.contains(s.charAt(j)))l++;
        }
        return f==l;
    }
}
