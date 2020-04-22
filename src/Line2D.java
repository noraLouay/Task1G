public class Line2D {
    public Point2D  startP,endP;
    private double slope;
    private boolean isHorizontal=false,isVertical=false;


    public Line2D(Point2D startP,Point2D endP)
    {
        if(!startP.isIdentical(endP)) {
            this.startP = startP;
            this.endP = endP;

            if (endP.getX() == startP.getX())
                isVertical = true;
            else
            {
                if(endP.getY()==startP.getY())
                    isHorizontal=true;
                slope = (endP.getY() - startP.getY()) / (endP.getX() - startP.getX());
            }
        }
        else
            System.out.println("Invalid Line!, start point and end point should be different");
    }

    public double getSlope()
    {
        return slope;
    }

    public boolean isParallel(Line2D other)
    {
        if((isVertical&&other.isVertical) || (isHorizontal&&other.isHorizontal))
            return true;

        return this.slope == other.slope;
    }

    public boolean isPerpendicular(Line2D other)
    {
        if((this.isHorizontal && other.isVertical)||(this.isVertical && other.isHorizontal))
            return true;
        return slope * other.slope == -1;
    }
}
