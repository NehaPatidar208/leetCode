class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length <3){
            return false;
        }
        int i,f=0;
        for(i=1;i<arr.length;i++){
            if((arr[i]==arr[i-1])||(arr[i-1]<=arr[i] && f==1)||(i==1 && arr[i]<=arr[i-1])){
                return false;
            }
            else if(arr[i-1]>arr[i]){
                f=1;
            }
        }
        if(f==0){
            return false;
        }
        return true;
        
    }
}
