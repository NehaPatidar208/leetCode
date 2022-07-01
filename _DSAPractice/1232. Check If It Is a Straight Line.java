class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length<2)return false;
        if(coordinates.length == 2) return true;
        int x1 = coordinates[0][0],x2=coordinates[1][0],y1=coordinates[0][1],y2=coordinates[1][1];
        int dx= x2-x1, dy=y2-y1;
        for(int i=2;i<coordinates.length;i++){
            if(dx*(coordinates[i][1]-y2)  != dy*(coordinates[i][0]-x2)) return false;
        }
        return true;
    }
}
