class Solution {
    public String multiply(String num1, String num2) {
        int m=num1.length(), n = num2.length();
        if(m==0 || n == 0)return "0";
        int tmpAr[]=new int[m+n];
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                int r= (num1.charAt(i)-'0')*(num2.charAt(j)-'0') + (tmpAr[i+j+1]);
                tmpAr[i+j] += r/10;
                tmpAr[i+j+1] = r%10;
            }
        }
        StringBuilder st = new StringBuilder();
        for(int i:tmpAr){
            if(!(st.length()==0 && i==0)){
                st.append(i);
            }
        }
        return st.length() == 0 ? "0" : st.toString();
    }
}
