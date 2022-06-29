class Solution {
    public int[][] reconstructQueue(int[][] people) {
        List<int[]> result = new ArrayList<>();
        //if values are same sort array in increasing order of 2nd index of subarray, other wise sort array in decreasing order
        Arrays.sort(people, (a,b)-> a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]);
        for(int[] a:people){
            result.add(a[1],a);
        }
        return result.toArray(new int[result.size()][]);
    }
}
