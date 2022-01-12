class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int mn =Integer.MAX_VALUE;
        for(int i = 1; i <triangle.size();i++){
            for (int j = 0 ; j < i+1 ; j++ ){
                if(j ==0){
                   triangle.get(i).set(j, triangle.get(i).get(j)+triangle.get(i-1).get(j));
                }else if(j ==i){
                   triangle.get(i).set(j, triangle.get(i).get(j)+triangle.get(i-1).get(j-1));
                }
                else{
                   triangle.get(i).set(j, triangle.get(i).get(j)+ Math.min(triangle.get(i-1).get(j-1),triangle.get(i-1).get(j))); 
                }
                
            }
        }
        for(int i = 0 ; i <triangle.get(triangle.size()-1).size();i++){
            mn=Math.min(mn,triangle.get(triangle.size()-1).get(i));
        }
        return mn;
    }
}
