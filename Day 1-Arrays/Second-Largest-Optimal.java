class Solution {
    public int secondLargestElement(int[] nums) {
        int n = nums.length;
        int largest = nums[0];
        int slargest = Integer.MIN_VALUE;
        for (int i = 1; i<n; i++){
            if (nums[i] > largest ){
                slargest = largest;
                largest = nums[i];
            }
            else if (nums[i] != largest && nums[i] > slargest){
                slargest = nums[i];
            }
        }

        if(slargest == Integer.MIN_VALUE) return -1;
        return slargest;
    }
}
