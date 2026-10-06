class Solution {
    public List<Integer> leaders(int[] nums) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int n = nums.length;
        int j = n-1;
        list.add(nums[j]);
        for (int i = j-1; i>=0; i--){
            if (nums[i] > nums[j]){
                list.add(nums[i]);
                j = i;
            }
        }
        Collections.reverse(list);
        
        return list;
    }
}

// Premium problem can't submit anywhere
//My approach is optimal and correct
