class Solution {
    public boolean isValidSudoku(char[][] board) {
        // 3 hashmaps with 9 keys each
        // one for row duplicates, one for columns and one for all the subsqares
        HashMap<Integer,Set<Integer>> row=new HashMap<>();
        HashMap<Integer,Set<Integer>> col=new HashMap<>();
        HashMap<Integer,Set<Integer>> sub=new HashMap<>();

        for(int i=0;i<9;i++){
            row.put(i,new HashSet<>());
            col.put(i,new HashSet<>());
            sub.put(i,new HashSet<>());
        }

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.') continue;

                int e=board[i][j]-'0';

                if(row.get(i).contains(e)) return false;
                else row.get(i).add(e);

                if(col.get(j).contains(e)) return false;
                else col.get(j).add(e);

                int sq=(i/3)*3+j/3;
                if(sub.get(sq).contains(e)) return false;
                else sub.get(sq).add(e);
            }
        }
        return true;
    }
}
