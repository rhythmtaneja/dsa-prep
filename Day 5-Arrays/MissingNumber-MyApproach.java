class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        
        //case 1
        for (int i = 0; i<n; i++){
            if(nums[i] != i){
                return i;
            }
        }

        //case 2
        if (nums[n - 1] != n) {return n;
        }

        return 0;
    }
}
