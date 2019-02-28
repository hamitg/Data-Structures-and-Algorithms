package FindShortestPaths;

import java.util.*;
import java.util.HashSet;
import java.util.Set;

public class FindShortestPath {


    Queue<Point> queue = new LinkedList<Point>();
    Set<Point> visited = new HashSet<Point>();
    int[][] grid;
    Point start;
    int rowSize;
    int colSize;

    public FindShortestPath(int[][] grid, Point start) {
        this.grid = grid;
        this.start = start;
        this.rowSize = grid.length;
        this.colSize = grid[0].length;
    }

    public void calculateShortestPath() {
        queue.add(start);
        visited.add(start);
        while (!queue.isEmpty()) {
            Point point = queue.peek();
            int moves = point.move;
            int r = point.r;
            int c = point.c;
            moveToAdjacentTiles(r, c, moves);
            queue.remove();
        }
    }

    public void printShortestPathsForAllPoints() {
        for (Point point : visited)
            System.out.println(point.r + "," + point.c + " : " + point.move);
    }

    boolean isInBounds(Point point) {
        return point.r >= 0 && point.c >= 0 && point.r < rowSize && point.c < colSize;
    }

    boolean canNotMove(Point currentPoint) {
        int currenPointRow = currentPoint.r;
        int currentPointCol = currentPoint.c;
        return !(isInBounds(currentPoint)) || visited.contains(currentPoint) || grid[currenPointRow][currentPointCol] == 0;
    }

    public void moveToAdjacentTiles(int r, int c, int moves) {
        for (Direction direction : Direction.values()) {
            Point currentPoint = new Point(r, c);
            currentPoint.makeMove(direction);
            if (canNotMove(currentPoint))
                continue;
            currentPoint.move = moves + 1;
            queue.add(currentPoint);
            visited.add(currentPoint);
        }
    }
}


