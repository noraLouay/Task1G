public class Point2D {
    private final double x;
    private final double y;

    public Point2D(int x,int y)
    {
        this.x=x;
        this.y=y;
    }

    public double getX()
    {
        return x;
    }

    public double getY() {
        return y;
    }

    public boolean isIdentical(Point2D other)
    {
        return this.x == other.getX() && this.y == other.getY();
    }
}
