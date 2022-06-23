class Solution {
    public int scheduleCourse(int[][] courses) {
        //sort array in increasing order of duration
        Arrays.sort(courses, (a, b) -> a[1] - b[1]);
        //PriorityQueue with maxheap
        PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> b - a);
        int time = 0;
        for(int[] c : courses){
            //if course is can be complete in giver duration 
            if(time + c[0] <= c[1]){
                time += c[0];
                q.offer(c[0]);
            }else if(!q.isEmpty() && c[0] < q.peek()){  //if cur course duration is lesser than the course having max duration in queue then remove that cource and insert cur course 
                time -= q.poll();
                time += c[0];
                q.offer(c[0]);
            }
        }
        // return total num of courses 
        return q.size();
    }
}
