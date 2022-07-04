class Solution {
    public int[] sortByBits(int[] arr) {
        List<Integer> a=new ArrayList<Integer>();
        for(Integer i: arr)a.add(i);
        Collections.sort(a, (i, j) -> Integer.bitCount(i) != Integer.bitCount(j) ? Integer.bitCount(i) - Integer.bitCount(j) : i - j);
        for(int i=0;i<arr.length;i++){
            arr[i] = a.get(i);
        }
        return arr;
    }
}
