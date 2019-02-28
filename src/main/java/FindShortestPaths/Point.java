package FindShortestPaths;

public class Point {

    int r;
    int c;
    int move = 0;


    public Point(int r, int c) {
        this.r = r;
        this.c = c;
    }

    public void makeMove(Direction d) {
        this.r += d.dr;
        this.c += d.dc;
    }

    public boolean equals (Object a) {
        Point point = (Point) a;
        if (point.r == this.r && point.c == this.c)
            return true;
        else
            return false;
    }

    public int hashCode() {
        return (5001 * this.r) + this.c;
    }
}

