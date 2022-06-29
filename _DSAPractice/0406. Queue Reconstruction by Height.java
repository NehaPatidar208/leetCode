class Solution {
    public int[][] reconstructQueue(int[][] people) {
        List<int[]> result = new ArrayList<>();
        Arrays.sort(people, (a,b)-> a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]);
        for(int[] a:people){
            result.add(a[1],a);
        }
        return result.toArray(new int[result.size()][]);
    }
}
