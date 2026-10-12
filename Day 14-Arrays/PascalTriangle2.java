class Solution {
    public List<Integer> getRow(int rowIndex) {
        long ans = 1; //long for vlarge answer
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(1);
        for (int col = 1; col < rowIndex+1; col++){
            ans = ans * ((rowIndex+1) - col); // row = 6; col = 1; NUM: 1*(6-1) = 5
            ans = ans / col; // col = 1; 5/1 = 5;
            ansRow.add((int) ans);
        }
        return ansRow;
    }
}
