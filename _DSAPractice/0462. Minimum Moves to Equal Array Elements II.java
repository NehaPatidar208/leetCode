/*
Given an integer array nums of size n, return the minimum number of moves required to make all array elements equal.

In one move, you can increment or decrement an element of the array by 1.

Test cases are designed so that the answer will fit in a 32-bit integer.
*/
/*
 TC = O(NlogN) for sorting , (O(n/2) = O(n) traversing) = O(NlogN)
 SC = O(1)
*/
/*
Alternative solution is sort array then find median (n/2), then make every element equals to median value
But that is less optimal
TC = O(NlogN) for sorting , O(n) for traversing = O(NlogN)
SC = O(1)
*/

class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int x=0,y=nums.length-1, sum=0;
        while(x<y){
            sum+=(nums[y]-nums[x]);
            x++;
            y--;
        }
        return sum;
    }
}
