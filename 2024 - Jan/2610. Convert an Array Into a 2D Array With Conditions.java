class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer, Integer> it: map.entrySet()){
            for(int i = 0;i<it.getValue();i++){
                if(result.size()>i){
                    result.get(i).add(it.getKey());
                }else{
                    result.add(new ArrayList<Integer>(Arrays.asList(it.getKey())));
                }
            }
        }
        return result;
    }
}
