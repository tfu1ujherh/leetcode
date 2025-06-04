class Solution {
    public void solveSudoku(char[][] board) {

        solve(board);
        
    }

    public boolean solve(char board[][]){

        for(int row=0;row<9;row++){
            for(int col=0;col<9;col++){
                if(board[row][col]=='.'){
                    for(char num='1';num<='9';num++){
                        if(isValid(board,row,col,num)){
                            board[row][col]=num;
                            if(solve(board)){
                                return true;
                            }
                            board[row][col]='.';
                        }
                    }
                    return false;
                }
            }
        }

        return true;
    }

    public boolean isValid(char board[][],int row,int col,char num){

        for (int i = 0; i < 9; i++) {
            // Row
            if (board[row][i] == num) return false;

            // Column
            if (board[i][col] == num) return false;

            // 3x3 box
            int boxRow = 3 * (row / 3) + i / 3;
            int boxCol = 3 * (col / 3) + i % 3;
            if (board[boxRow][boxCol] == num) return false;
        }
        return true;
    }
}