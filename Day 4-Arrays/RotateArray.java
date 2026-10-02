class Solution {
    public void rotate(int[] nums, int k) {
         int n = nums.length;
         k %= n; //if 8 rotations = 7 rotations +1 (that means only 1 rotation) hence k =1 not 8, so for that we used k%n, if less than 7 then same number
         reverse (nums, 0, n-1);
         reverse (nums, 0, k-1);
         reverse (nums, k, n-1);

        
    }
    private void reverse (int[] nums, int left, int right){
        while (left <= right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
