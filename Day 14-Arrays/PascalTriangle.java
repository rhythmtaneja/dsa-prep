class Solution {
    // func to find values in each row
    private List<Integer> generateRow(int row) {
        long ans = 1; //long for vlarge answer
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(1);
        for (int col = 1; col < row; col++){
            ans = ans * (row - col); // row = 6; col = 1; NUM: 1*(6-1) = 5
            ans = ans / col; // col = 1; 5/1 = 5;
            ansRow.add((int) ans);
        }
        return ansRow;
    }
    //add those rows and get entire triangle
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 1; i<=numRows; i++){ 
            ans.add(generateRow(i));
        }
        return ans;
    }
}
