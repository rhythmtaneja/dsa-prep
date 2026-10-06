class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int res = 0;
        int majority = 0;
        for (int n : nums){
            mpp.put(n, 1 + mpp.getOrDefault(n,0));
            if (mpp.get(n) > majority){
                res = n;
                majority = mpp.get(n);
            }
        }
        return res;
    }
}
