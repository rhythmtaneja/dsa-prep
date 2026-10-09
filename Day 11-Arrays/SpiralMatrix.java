class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       int n = matrix.length;
       int m = matrix[0].length;
       int left = 0, right = m-1;
       int top = 0, bottom = n-1;
       ArrayList<Integer> list = new ArrayList<Integer> ();

    while(top <= bottom && left <= right) {
    
       //left -> right
       for (int i = left; i<= right; i++){
        list.add(matrix[top][i]);
       }
       top++;

       //top -> bottom
       for (int i = top; i<=bottom; i++){
        list.add(matrix[i][right]);
       }
       right--;

       // if statement in 1 row only given case, like 1,2,3 thats it; so to check if top is still lesser than bott. then only start further
       if (top <= bottom){
       //right -> left
       for (int i = right; i>=left; i--){
        list.add(matrix[bottom][i]);
       }
       bottom--; 
       }

       //check to not print last element again in spiral and stop before;
       if (left <= right){
       //bottom -> top
       for (int i = bottom; i>=top; i--){
        list.add(matrix[i][left]);
       }
      left++;
       }
    }
    return list;
}
}
