public class JZ23 {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence.length == 0){
            return false;
        }

        return dfs(sequence,0,sequence.length);
    }

    private boolean dfs(int[] sequence, int start, int end){
        if (start >= end){
            return true;
        }
        int i = end;
        while (i >= start && sequence[i] >= sequence[end]){
            i--;
        }
        if (i < 0){
            return true;
        }
        for (int j = i; j >= start; j--){
            if (sequence[j] > sequence[end]){
                return false;
            }
        }
        return dfs(sequence, start, i) && dfs(sequence, i+1, end-1);
    }
}
