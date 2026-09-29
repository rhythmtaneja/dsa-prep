class Solution {
    public int secondLargestElement(int[] nums) {
        int n = nums.length;
        int largest = nums[0];
        int slargest = -1;
        for (int i = 0; i<n; i++){
            if (nums[i] > largest){
                largest = nums[i];
            }
        }
        for (int i = 0; i< n ; i++){
            if (nums[i] > slargest && nums[i] != largest){
                slargest = nums[i];
            }
        }
        return slargest;
    }
}
