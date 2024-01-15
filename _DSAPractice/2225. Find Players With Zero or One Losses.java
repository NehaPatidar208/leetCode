class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Set<Integer> win = new HashSet<>();
        Map<Integer,Integer> loss = new HashMap<>();
        List<Integer>zerolos = new ArrayList<>();
        List<Integer>onelos = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int[]a:matches){
            win.add(a[0]);
            loss.put(a[1],loss.getOrDefault(a[1],0)+1);
        }
        for(int i : win){
            if(!loss.containsKey(i))zerolos.add(i);
        }
        for(Map.Entry<Integer,Integer> m:loss.entrySet()){
            if(m.getValue()==1)onelos.add(m.getKey());
        }
        Collections.sort(zerolos);
        Collections.sort(onelos);
        result.add(zerolos);
        result.add(onelos);
        return result;
    }
}
