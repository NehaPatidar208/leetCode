/*
Given an array of positive integers arr, return the sum of all possible odd-length subarrays of arr.
A subarray is a contiguous subsequence of the array.

test case: 
        Input: arr = [1,4,2,5,3]
        Output: 58
        Explanation: The odd-length subarrays of arr and their sums are:
        [1] = 1
        [4] = 4
        [2] = 2
        [5] = 5
        [3] = 3
        [1,4,2] = 7
        [4,2,5] = 11
        [2,5,3] = 10
        [1,4,2,5,3] = 15
        If we add all these together we get 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58
*/
/*
      for(i=0;i<n;i++){
            start = n-i;               //number of subarray starting with ith index
            end = 1+i;                 //number of subarray starting with ith index
            total = start*end;         // total num of occurance of ith element in subarrays
            odd = (total+1)/2;         // total num of occurance of ith element in odd length subarrays 
            sum+= ( odd * arr[i]);
        }

*/

class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int i,sum=0, n=arr.length;
        for(i=0;i<n;i++){
            sum+= ((n - i) * (1 + i) + 1) / 2 * arr[i];
        }
        return sum;
    }
}
