class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2; //sum of n numbers

        for (int num : nums ){
            sum -= num; // sum of 3 (n=3) is 6, sum of available numbers [3,0,1]
            // is 4. Difference? 2
        }
        return sum;
    }
}
