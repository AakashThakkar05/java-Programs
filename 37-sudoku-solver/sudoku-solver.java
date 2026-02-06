class Solution {
    public boolean isValid(char[][] board, int row, int col, int val){
        for(int var = 0; var < 9; var++){
            if((board[row][var] == val) || (board[var][col] == val))
            return false;
            if(board[3*(row/3) + var/3] [3*(col/3) + var%3] == val)
            return false;
        }
        return true;
    }
    public boolean solve(char[][] board){
        for(int i = 0; i < 9; i++){
            for(int j = 0 ; j < 9; j++){
                if(board[i][j] == '.'){
                    for(char k = '1'; k <= '9'; k++){
                        if(isValid(board, i , j, k)){
                            board[i][j] = k;
                            if(solve(board))
                                return true;
                            board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public void solveSudoku(char[][] board) {
        solve(board);
    }
}