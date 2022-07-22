class Solution {
    public String addStrings(String num1, String num2) {
        Stack<Integer>s1 = new Stack<>();
        Stack<Integer>s2 = new Stack<>();
        String result ="";
        for(int i=0;i<num1.length();i++){
            s1.push(num1.charAt(i)-'0');
        }
        for(int i=0;i<num2.length();i++){
            s2.push(num2.charAt(i)-'0');
        }
        int carry = 0;
        while(!s1.isEmpty() && !s2.isEmpty()){
            System.out.println(s1.peek()+" " +s2.peek());
            int t = s1.pop()+s2.pop()+carry;
            result = String.valueOf(t%10) + result;
            carry = t/10;
        }
        while(!s1.isEmpty()){
            int t=s1.pop()+carry;
            result = String.valueOf(t%10) + result;
            carry=t/10;
        }
        while(!s2.isEmpty()){
            int t = s2.pop()+carry;
            result = String.valueOf(t%10) + result;
            carry=t/10;
        }
        if(carry!=0){
            result = String.valueOf(carry) + result;
        }
        return result;
    }
}
