class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer>map = new HashMap<>();
        List<String> result = new ArrayList<>();
        PriorityQueue<Map.Entry<String,Integer>> q = new PriorityQueue<>((a,b)-> a.getValue()==b.getValue()?a.getKey().compareTo(b.getKey()) : b.getValue()- a.getValue());
        for(String s:words){
            if(!map.containsKey(s)){
                map.put(s,1);
            }else{
                map.put(s,map.get(s)+1);
            }
        }
        for(Map.Entry<String, Integer> entry: map.entrySet())
        {
            q.offer(entry);
        }
        while(k-->0){
            result.add(q.poll().getKey());
        }
        return result;
    }
}
