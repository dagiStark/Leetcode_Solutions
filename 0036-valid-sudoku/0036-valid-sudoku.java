class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> ans = new HashSet<>();
        for(int i=0; i < 9; i++){
            for(int j = 0; j< 9 ; j++){
                char temp = board[i][j];
                if(temp != '.'){
                    if(ans.contains(temp + "-R-" + i) ||
                       ans.contains(temp + "-C-" + j) ||
                       ans.contains(temp + "-B-" + i/3 + "-D-" + j/3) ){ return false;

                    }else{
                        ans.add(temp + "-R-" + i);
                        ans.add(temp + "-C-" + j);
                        ans.add(temp + "-B-" + i/3 + "-D-" + j/3);
                    }

                }
            }
        }
        return true;
    }
}