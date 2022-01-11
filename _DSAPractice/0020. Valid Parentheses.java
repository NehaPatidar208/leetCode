class Solution {
    public boolean isValid(String s) {
        Stack temp = new Stack();
        for(int i=0;i<s.length();i++){
            Character ch = s.charAt(i);
            if(ch.equals('(') || ch.equals('[') || ch.equals('{')){
                temp.push(ch);
            }
            else if(temp.empty()) return false;
            else if((ch.equals(')') && temp.peek().equals('(')) || (ch.equals(']') && temp.peek().equals('[')) || (ch.equals('}') && temp.peek().equals('{'))){
                temp.pop();
            }else return false;
        }
        if (temp.empty()) return true;
        return false;
    }
}
