public class JZ1 {
    public boolean Find(int target, int [][] array) {
        int row = array.length;
        if(row == 0){
            return false;
        }
        int col = array[0].length;
        int i = 0, j = col-1;
        while (i < row && j >= 0){
            if (target == array[i][j]){
                return true;
            }
            else if(j >= 0 && target < array[i][j]){
                j--;
            }
            else if (i < row && target > array[i][j]){
                i++;
            }
        }
        return false;
    }
}