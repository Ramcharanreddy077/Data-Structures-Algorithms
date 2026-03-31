package RecursionExample.Backtracking;

import java.util.Arrays;

public class mazeallpaths {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        int[][] path = new int[maze.length][maze[0].length];
//        allpaths("",maze,0,0);
        printallpaths("", maze, 0, 0, path, 1);
    }

    static void allpaths(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 || c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[r][c]) {
            return;
        }
        maze[r][c] = false;
        if (r < maze.length - 1) {
            allpaths(p + 'D', maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            allpaths(p + 'R', maze, r, c + 1);
        }
        if (r > 0) {
            allpaths(p + 'U', maze, r - 1, c);
        }
        if (c > 0) {
            allpaths(p + 'L', maze, r, c - 1);
        }
        maze[r][c] = true;
    }

    static void printallpaths(String p, boolean[][] maze, int r, int c, int[][] path, int step) {

        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step;
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if (!maze[r][c]) {
            return;
        }
        maze[r][c] = false;
        path[r][c] = step;
        if (r < maze.length - 1) {
            printallpaths(p + 'D', maze, r + 1, c, path, step + 1);
        }
        if (c < maze[0].length - 1) {
            printallpaths(p + 'R', maze, r, c + 1, path, step + 1);
        }
        if (r > 0) {
            printallpaths(p + 'U', maze, r - 1, c, path, step + 1);
        }
        if (c > 0) {
            printallpaths(p + 'L', maze, r, c - 1, path, step + 1);
        }
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
