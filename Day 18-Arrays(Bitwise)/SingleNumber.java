class Solution {
    public int singleNumber(int[] nums) {
        int index = 0;
        for (int i=0; i<nums.length; i++){
            index = index ^ nums[i]; // a ^ a = 0, a ^ 0 = a (XOR);
        }
        return index;
    }
}
