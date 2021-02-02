class Solution {
    public int[] replaceElements(int[] arr) {
        Stack <Integer> st=new Stack<Integer>();
        st.push(-1);
        st.push(arr[arr.length-1]);
        for(int i=arr.length-2;i>0;i--){
            if(st.peek()<=arr[i]){
                st.push(arr[i]);
            }
        }
        int [] res=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(st.peek()==arr[i]){
                st.pop();
            }
            res[i]=st.peek();
        }
        return res;
    }
}
