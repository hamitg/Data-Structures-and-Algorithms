package FindShortestPaths;

public enum Direction {
    LEFT(0, -1),
    UP(1, 0),
    RIGHT(0, 1),
    DOWN(-1, 0);

    public int dr;
    public int dc;


    Direction(int dr, int dc) {
        this.dr = dr;
        this.dc = dc;
    }
}