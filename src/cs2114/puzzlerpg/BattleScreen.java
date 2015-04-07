package cs2114.puzzlerpg;

import sofia.app.Screen;

// -------------------------------------------------------------------------
/**
 *  Battle Screen of the Puzzle-RPG.
 *
 *
 *  @author Kasey Johnson
 *  @author
 *  @version Mar 29, 2015
 */
public class BattleScreen
    extends Screen

    private PuzzleGrid puzzle;
{
    // ----------------------------------------------------------
    /**
     * Initialize the battle screen
     */
    public void initialize() {

        puzzle = new PuzzleGrid(6);
        puzzle.addObserver(this);

    }

    // ----------------------------------------------------------
    /**
     * Place a description of your method here.
     * @param x
     * @param y
     */
    public void onTouchMove(float x, float y) {

    }

    // ----------------------------------------------------------
    /**
     * Place a description of your method here.
     * @param x
     * @param y
     */
    public void ProcessTouch(float x, float y) {

    }

    // ----------------------------------------------------------
    /**
     * Place a description of your method here.
     * @param puzzle
     */
    public void changeWasObserved(PuzzleGrid puzzle) {

    }

}
