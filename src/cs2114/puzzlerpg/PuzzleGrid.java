package cs2114.puzzlerpg;

import java.util.Random;

// -------------------------------------------------------------------------
/**
 * Write a one-sentence summary of your class here. Follow it with additional
 * details about its purpose, what abstraction it represents, and how to use it.
 *
 * @author Kasey Johnson
 * @version Mar 29, 2015
 */
public class PuzzleGrid
    extends sofia.util.Observable
    implements PuzzleGridI
{
    private int             size;
    private GemCellType[][] gemLayout;
    private Random          rand;


    // ----------------------------------------------------------
    /**
     * Create a new PuzzleGrid object.
     *
     * @param size
     *            the length/width of the board
     */
    public PuzzleGrid(int size)
    {
        this.rand = new Random();
        this.size = size;
        gemLayout = new GemCellType[size][size];

        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                fillSquare(i, j);
            }
        }

    }


    /**
     * Randomly Selects a Cell type to fill in layout
     */
    private void fillSquare(int x, int y)
    {

        switch (rand.nextInt(3))
        {
            case 0:
                gemLayout[x][y] = GemCellType.EARTH;

            case 1:
                gemLayout[x][y] = GemCellType.FIRE;

            case 2:
                gemLayout[x][y] = GemCellType.WATER;

            case 3:
                gemLayout[x][y] = GemCellType.HEAL;

            default:
                // does nothing
                break;
        }

    }


    public GemCellType remove(Location location)
    {

        GemCellType type = this.getType(location);
        // What to do with removed GEM(WHAT does removing mean?)
        notifyObservers();

        return type;
    }


    public int size()
    {
        return this.size;
    }


    public void switchGems(Location location1, Location location2)
    {
        GemCellType temp = this.getType(location1);
        gemLayout[location1.getX()][location1.getY()] = this.getType(location2);
        gemLayout[location2.getX()][location2.getY()] = temp;
        notifyObservers();

    }


    public GemCellType getType(Location location)
    {
        return gemLayout[location.getX()][location.getY()];
    }


    public void setType(Location location, GemCellType gemType)
    {
        gemLayout[location.getX()][location.getY()] = gemType;

    }


    /**
     * Unlimited moves for regular mode
     *
     * @return always true for regular mode
     */
    public boolean movesLeft()
    {
        return true;
    }

}
