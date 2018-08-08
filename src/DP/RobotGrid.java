package DP;

import java.util.ArrayList;
import java.util.List;

public class RobotGrid {
    public static class Coordinate{
        public int x;
        public int y;
        public Coordinate(int x , int y){
            this.x = x;
            this.y = y;
        }
    }

    public static List<Coordinate> findPath(int[][] grid){
        List[][] path = new List[grid.length][grid[0].length];
        path[0][0] = new ArrayList<Coordinate>();
        for(int i = 0 ; i<grid.length ; i++){
            for(int j = 0; j<grid[i].length ; j++){
                if(path[i][j] == null){
                    continue;
                }
                if(i+1 < grid.length && grid[i+1][j] != 0){
                    List<Coordinate> list = new ArrayList<Coordinate>(path[i][j]);
                    list.add(new Coordinate(i,j));
                    path[i+1][j] = list;
                }
                if( j+1 <grid[i].length && grid[i][j+1] != 0){
                    List<Coordinate> list = new ArrayList<Coordinate>(path[i][j]);
                    list.add(new Coordinate(i,j));
                    path[i][j+1] = list;
                }
            }
        }

        return path[grid.length-1][grid[0].length-1];
    }
}
