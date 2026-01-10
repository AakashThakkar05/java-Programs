class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int first = 0,last = (m*n)-1;
        while(first <= last){
            int mid = first + (last - first)/ 2;
            int mr = mid / n;
            int mc = mid % n;
            if(matrix[mr][mc] == target){
                return true;
            }else if(matrix[mr][mc] < target){
                first = mid + 1;
            }else{
                last = mid - 1;
            }
        }
        return false;
    }
}