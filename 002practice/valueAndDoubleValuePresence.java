class Solution {
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer,Integer> d=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if (d.containsKey(arr[i]*2)||(arr[i]%2==0 && d.containsKey(arr[i]/2))){
                return true;
            }else{
                d.put(arr[i],1);
            }
        }
        return false;
    }
}
