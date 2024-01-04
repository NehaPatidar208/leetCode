class Solution {
    public int minOperations(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        int result=0;
        for(Map.Entry<Integer,Integer> m : map.entrySet()){
            if(m.getValue()==1)return -1;
            if(m.getValue()%3==0)result+=m.getValue()/3;
            else result+=(m.getValue()/3)+1;
        }
               return result;
    }
}
