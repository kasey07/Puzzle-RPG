package cs2114.puzzlerpg;

import java.util.Observable;
import java.util.Observer;

// -------------------------------------------------------------------------
/**
 *  Write a one-sentence summary of your class here.
 *  Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 *
 *  @author Kasey Johnson
 *  @version Mar 29, 2015
 */
public class PuzzleGrid extends sofia.util.Observable
    implements PuzzleGridI
{
    private int size;
    private GemCellType[][] gemLayout;

    public PuzzleGrid(int size) {
        this.size = size;
        gemLayout = new GemCellType[size][size];

        //Fill randomly with different types of cells

    }

    public GemCellType remove(Location location)
    {
        // TODO Auto-generated method stub
        return null;
    }

    public int size()
    {
        return this.size;
    }

    public void switchGems(Location location1, Location location2)
    {
        // TODO Auto-generated method stub

    }

    public GemCellType getType(Location location)
    {
        // TODO Auto-generated method stub
        return null;
    }

    public void setType(Location location, GemCellType gemType)
    {
        // TODO Auto-generated method stub

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

    public void update(Observable observable, Object data)
    {
        // TODO Auto-generated method stub

    }


}
