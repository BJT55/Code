import java.util.Scanner;

public class Day24_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int row = in.nextInt();
            int col = in.nextInt();
            int[][] maze = new int[row][col];
            for (int i = 0; i < row; ++i){
                for (int j = 0; j < col; ++j){
                    maze[i][j] = in.nextInt();
                }
            }
            findPathOfMaze(maze,0,0);
            printPath(maze,0,0);
        }
    }
    public static void findPathOfMaze(int[][] maze,int i, int j){
        if (i == maze.length-1 && j == maze[0].length-1){
            return;
        }
        // 向下走
        if (i+1 < maze.length && maze[i+1][j] == 0){
            findPathOfMaze(maze,i+1,j);
        }
        // 向右走
        if (j+1 < maze[0].length && maze[i][j+1] == 0){
            findPathOfMaze(maze,i,j+1);
        }
        // 在最后一行向右走不通
        if (i == maze.length-1 && maze[i][j+1] == 1){
            maze[i][j] = 1;
        }
        // 在最右一列向下走不通
        if (j == maze[0].length-1 && maze[i+1][j] == 1){
            maze[i][j] = 1;
        }
        // 未到达边界,此时向下向上都走不通
        if (i+1 < maze.length && j+1 < maze[0].length){
            if (maze[i+1][j] == 1 && maze[i][j+1] == 1){
                maze[i][j] = 1;
            }
        }
    }
    public static void printPath(int[][] maze, int i, int j){
        if (i == maze.length || j == maze[0].length){
            return;
        }

        if (maze[i][j] == 0){
            System.out.println("(" + i + "," + j + ")");
        }else {
            return;
        }

        printPath(maze,i+1,j);
        printPath(maze,i,j+1);
    }
}
