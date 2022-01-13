class Solution {
    public static void sortByEnd(int array[][], int col){
        Arrays.sort(array,new Comparator<int[]>(){
            public int compare(int first[], int second[]){
                if (first[col]>second[col]) return 1;
                else return -1;
            }
        });
    }
    public int findMinArrowShots(int[][] points) {
        sortByEnd(points,1);
        int lst=points[0][1], res= 1;
        for(int i = 1;i<points.length;i++){
            if(points[i][0]<=lst){
                continue;
            }else{
                res++;
                lst=points[i][1];
            }
        }
        return res;
    }
}
