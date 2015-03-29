package cs2114.puzzlerpg;


/**
 *  This Location class represents a constant
 *  point in a 2D grid.
 *
 *  @author andrew
 *  @version Mar 29, 2015
 */
public class Location
{
    private final int x;
    private final int y;

    /**
     * Create a new Location with constant
     * values 'x' and 'y'.
     * @param x x coordinate
     * @param y y coordinate
     */
    public Location(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    /**
     * Return the x coordinate of the
     * location.
     * @return x coordinate
     */
    public int getX()
    {
        return x;
    }

    /**
     * Return the y coordinate of the
     * location.
     * @return y coordinate.
     */
    public int getY()
    {
        return y;
    }
}

