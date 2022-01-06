class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int ar[]= new int[1001];
        for(int i = 0; i< trips.length;i++){
            ar[trips[i][1]]+=trips[i][0];
            ar[trips[i][2]]-=trips[i][0];
        }
        if(ar[0]> capacity) return false;
        for(int i = 1 ;i<ar.length;i++){
            ar[i]+=ar[i-1];
                if (ar[i]>capacity){
                    return false;
                }
        }
        return true;
    }
}
