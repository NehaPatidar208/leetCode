class Solution {
   
    public String getPermutation(int n, int k) {
        int fact=1;
        List<Integer>number = new ArrayList<>();
        for(int i=1;i<n;i++){
            fact*=i;
            number.add(i);
        }
        number.add(n);
        String result="";
        k-=1;
        while(true){
            result+= String.valueOf(number.get(k/fact));
            number.remove(k/fact);
            if(number.size()==0)break;
            k=k%fact;
            fact/=number.size();
        }
        return result;
    }
}
