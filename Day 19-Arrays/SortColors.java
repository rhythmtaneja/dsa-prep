//Dutch National Flag Algo
class Solution {

    private void swap(int[] nums, int left, int right){
       int temp = nums[left];
       nums[left] = nums[right];
       nums[right] = temp;
    }

    
    public void sortColors(int[] nums) {
        int n = nums.length;
        int white = 0 , red = 0; //mid , low
        int blue = n-1; //high

        while (white <= blue){
            if (nums[white] == 0){
                swap(nums, white, red);
                white++;
                red++;
            }
            else if (nums[white] == 1){
                white++;
            }
            else {
                swap(nums, white, blue);
                blue--;
            }
        }
    }
}
