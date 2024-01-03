class Solution {
    public int numberOfBeams(String[] bank) {
        int preCount=0, result=0;
        for(int i=0;i<bank.length;i++){
            int temp=0;
            for(int j=0;j<bank[i].length();j++){
                if(bank[i].charAt(j)=='1'){
                    temp++;
                }
            }
            if(temp!=0){
                result = result+(preCount*temp);
                //System.out.println("result = "+result + " preCount = "+preCount + "temp = "+temp);
                preCount=temp;
            }
        }
        return result;
    }
}
