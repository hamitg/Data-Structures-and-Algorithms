package FindShortestPaths;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestFindShortestPaths {
    @Test
    public void testFindShortestPaths () {
        Point point = new Point(0, 0);
        FindShortestPath findShortestPath = new FindShortestPath(grid1, point);
        findShortestPath.calculateShortestPath();
        findShortestPath.printShortestPathsForAllPoints();
    }



    int [][] grid1 = new int[][]{
            { 1, 0, 1, 0, 1, 1, 0, 1, 1, 1 },
            { 1, 0, 1, 0, 0, 1, 0, 1, 1, 1 },
            { 1, 0, 1, 0, 0, 1, 0, 1, 1, 1 },
            { 1, 1, 1, 0, 0, 1, 0, 1, 1, 1 },
            { 1, 0, 1, 0, 0, 1, 0, 1, 1, 1 }
    };

}

