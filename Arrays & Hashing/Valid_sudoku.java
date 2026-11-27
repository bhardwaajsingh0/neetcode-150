class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] row = new HashSet[9];
        HashSet<Character>[] col = new HashSet[9];
        HashSet<Character>[] box = new HashSet[9];

        for(int i=0; i<9; i++){
            row[i] = new HashSet<>();
            col[i] = new HashSet<>();
            box[i] = new HashSet<>();
        }

        for(int r = 0; r<board.length ; r++){
            for(int c = 0; c<board.length; c++){
                char k = board[r][c];
                if(k == '.') continue;
                int b = (r/3)*3 + (c/3);
                if(row[r].contains(k) ||
                   col[c].contains(k) ||
                   box[b].contains(k)){
                    return false;
                }
                else{
                    row[r].add(k);
                    col[c].add(k);
                    box[b].add(k);
                }
            }
        }
        return true;
    }
}
