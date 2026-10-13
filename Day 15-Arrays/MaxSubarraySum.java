//kadane's algo
class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i =0; i<nums.length; i++){
            sum += nums[i];
            maxSum = Math.max(sum, maxSum);
            if (sum < 0){ // this step is imp, anything -ve will decrease our sum only in future, no point of carrying -ve in sum value;
                sum = 0;
            }
        }
        return maxSum;
    }
}
