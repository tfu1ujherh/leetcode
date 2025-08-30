class Solution {
    public boolean isValidSudoku(char[][] board) {

        boolean rowCheck[][]=new boolean[9][9];
        boolean colCheck[][]=new boolean[9][9];
        boolean boxCheck[][]=new boolean[9][9];

        for(int row=0;row<9;row++){
            for(int col=0;col<9;col++){

                if(board[row][col]!='.'){
                    int num=board[row][col]-'1';
                    int boxIndex=(row/3)*3+(col/3);

                    if(rowCheck[row][num]||colCheck[col][num]||boxCheck[boxIndex][num]){
                        return false;
                    }

                    rowCheck[row][num]=true;
                    colCheck[col][num]=true;
                    boxCheck[boxIndex][num]=true;
                }
            }
        }

        return true;
        
    }
}