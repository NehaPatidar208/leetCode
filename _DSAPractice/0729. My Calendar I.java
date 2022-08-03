// TC : O(NlogN)
class MyCalendar {
   TreeMap<Integer, Integer> map;
    public MyCalendar() {
        map = new TreeMap<>();
    }
    
    public boolean book(int start, int end) {
        Integer floor = map.floorKey(start), ceil = map.ceilingKey(start);
        if((floor == null || map.get(floor) <=start) && (ceil == null || ceil >= end)){
            map.put(start,end);
            return true;
        }
        return false;
    }
}

/*
TC - O(N*N)
class MyCalendar {
    List<int[]> resultList;
    public MyCalendar() {
        resultList = new ArrayList<>();
    }
    
    public boolean book(int start, int end) {
        for(int[] ar:resultList){
            if(start<ar[1] && start >= ar[0] || start <= ar[0] && end>ar[0]) return false;
        }
        resultList.add(new int[]{start,end});
        return true;
    }
}
*/
/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */
