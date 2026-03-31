package RecursionExample.Backtracking;

import java.util.ArrayList;

public class Mazepath {
    public static void main(String[] args) {
        boolean [][] maze={
                {true,true,true},
                {true,true,false},
                {true,true,true}
        };
        pathwithObstacles("",maze,0,0);
//        path("",3,3);
//        System.out.println(pathList("",3,3));
//        System.out.println(pathListDiagonal("",3,3));
//        System.out.println(count(3,3));
    }
    //moving in the maze with only right move and down move
    static void path(String p,int r,int c){
        if(r==1&&c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            path(p+'D',r-1,c);
        }
        if(c>1){
            path(p+'R',r,c-1);
        }
    }
    static int count(int r,int c){
        if(r==1||c==1){
            return 1;
        }
        int left=count(r-1,c);
        int right=count(r,c-1);
        return left+right;
    }
    static ArrayList<String> pathList(String p, int r, int c){
        if(r==1&&c==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        if(r>1){
            ans.addAll(pathList(p+'D',r-1,c));
        }
        if(c>1){
            ans.addAll(pathList(p+'R',r,c-1));
        }
        return ans;
    }
    //moving in the maze with all chances(vertically,horizontally and also diagonally)
    static ArrayList<String> pathListDiagonal(String p, int r, int c){
        if(r==1&&c==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        if(r>1&&c>1){
            ans.addAll(pathListDiagonal(p+'D',r-1,c-1));
        }
        if(r>1){
            ans.addAll(pathListDiagonal(p+'V',r-1,c));
        }
        if(c>1){
            ans.addAll(pathListDiagonal(p+'H',r,c-1));
        }
        return ans;
    }
    static void pathwithObstacles(String p,boolean[][] maze,int r,int c){
        if(r==maze.length-1&&c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(maze[r][c]==false){
            return;
        }
        if(r< maze.length-1){
            pathwithObstacles(p+'B',maze,r+1,c);
        }
        if(c<maze[0].length-1){
            pathwithObstacles(p+'R',maze,r,c+1);
        }
    }
 
}
