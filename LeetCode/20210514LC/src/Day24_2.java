import java.util.Scanner;

public class Day24_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int row = in.nextInt();
            int col = in.nextInt();
            int[][] puzzle = new int[row][col];
            for (int i = 0; i < row; ++i){
                for (int j = 0; j < col; ++j){
                    puzzle[i][j] = in.nextInt();
                }
            }
            searchOnePath(puzzle,0,0);
            printPath(puzzle,0,0);
        }
    }
    public static void searchOnePath(int[][] puzzle, int i, int j){
        if (i == puzzle.length-1 || j == puzzle[0].length-1){
            return;
        }
        // 向左走
        if (i+1 < puzzle.length){
            if (puzzle[i+1][j] == 0){
                searchOnePath(puzzle,i+1,j);
            }
        }
        // 向右走
        if (j+1 < puzzle[0].length){
            if (puzzle[i][j+1] == 0){
                searchOnePath(puzzle,i,j+1);
            }
        }
        // 在最后一行不能向右走,此路不通
        if (i+1 == puzzle.length && puzzle[i][j+1] == 1){
            puzzle[i][j] = 1;
        }
        // 在最右边不能向下走,此路不通
        if (j+1 == puzzle[0].length && puzzle[i+1][j] == 1){
            puzzle[i][j] = 1;
        }
        // 不能向下也不能向右走,此时未到达迷宫出口
        if ( i+1 < puzzle.length && j+1 < puzzle[0].length){
            if (puzzle[i+1][j] == 1 && puzzle[i][j+1] == 1 ){
                puzzle[i][j] = 1;
            }
        }
    }

    public static void printPath(int[][] puzzle,int i, int j){
        if (i == puzzle.length && j == puzzle[0].length){
            return;
        }
        if (puzzle[i][j] == 0){
            System.out.println("("+i+","+j+")");
        }else {
            return;
        }
        printPath(puzzle,i+1,j);
        printPath(puzzle,i,j+1);
    }
}
