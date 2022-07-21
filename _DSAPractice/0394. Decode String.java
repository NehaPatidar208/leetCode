class Solution {
    public String decodeString(String s) {
        
        Stack<Character> st = new Stack<>();
        for(char c:s.toCharArray()){
            if(c==']' && !st.isEmpty()){
                String result="";
                String tmp = "";
                while(st.peek()!='['){
                    tmp=st.pop()+tmp;
                }
                st.pop();
                String num="";
                while(!st.isEmpty() && Character.isDigit(st.peek())){
                    num = st.pop()+num;
                }
                int n=Integer.valueOf(num);
                while(n-- >0){
                    result+=tmp;
                }
                for(int i=0;i<result.length();i++){
                    st.push(result.charAt(i));
                }
                
            }else{
                st.push(c);
            }
        }
        String res="";
        while(!st.isEmpty()){
            res = st.pop()+res;
        }
        return res;
    }
}
