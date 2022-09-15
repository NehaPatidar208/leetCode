class Solution {
    public int[] findOriginalArray(int[] changed) {
        if(changed.length%2==1)return new int[]{};
        Map<Integer,Integer> map = new HashMap<>();
        for(int a:changed){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        Arrays.sort(changed);
        int[]result = new int[changed.length/2];
        System.out.println(result[0]);
        int i=0;
        for(int a:changed){
            if(!map.containsKey(a)){
                continue;
            }
            if(map.get(a)>1){
                    map.put(a,map.get(a)-1);
            }else{
                    map.remove(a);
            }
            if(!map.containsKey(a*2))return new int[]{};
            if(map.get(a*2)>1){
                    map.put(a*2,map.get(a*2)-1);
            }else{
                    map.remove(a*2);
                }
            result[i]=a;
            i++;
        }
        return result;
    }
}
