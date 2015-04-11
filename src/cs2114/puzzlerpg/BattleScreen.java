package cs2114.puzzlerpg;

import sofia.app.ShapeScreen;
import sofia.graphics.ShapeView;
import sofia.graphics.Color;
import sofia.graphics.RectangleShape;
import sofia.app.Screen;

// -------------------------------------------------------------------------
/**
 * Battle Screen of the Puzzle-RPG.
 *
 * @author Kasey Johnson
 * @author
 * @version Mar 29, 2015
 */
public class BattleScreen
    extends ShapeScreen
{

    private PuzzleGrid   puzzle;
    private int          length;
    private ShapeView    shapeView;
    private GemShape[][] gem;
    private Location     firstClick;


    // ----------------------------------------------------------
    /**
     * Initialize the battle screen
     */
    public void initialize()
    {
        firstClick = null;

        puzzle = new PuzzleGrid(6);
        puzzle.addObserver(this);
        this.length =
            (Math.min(shapeView.getHeight(), shapeView.getWidth()) / 6) / 2;
        this.gem = new GemShape[6][6];
        setupScreen();
    }


    private void setupScreen()
    {

        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 8; j++)

            {
                GemShape square =
                    new GemShape(
                        length * j,
                        length * i,
                        length * (j + 1),
                        length * (i + 1),
                        puzzle.getType(new Location(i, j)));

                shapeView.add(square);
                gem[i][j] = square;

            }
        }

    }


    // ----------------------------------------------------------
    /**
     * Place a description of your method here.
     *
     * @param x
     * @param y
     */
    public void onTouchMove(float x, float y)
    {

    }


    // ----------------------------------------------------------
    /**
     * Determines the equivalent coordinate of a pixel
     *
     * @param value
     *            the value location of the screen
     * @return returns the coordinate value
     */
    private int getValue(float value)
    {
        return (int)(value / length);

    }


    /**
     * Place a description of your method here.
     *
     * @param x
     * @param y
     */
    public void ProcessTouch(float x, float y)
    {
        GemShape tile =
            this.getShapes().locatedAt(x, y).withClass(GemShape.class).front();

        if (tile != null)
        {
            int yValue = getValue(x);
            int xValue = getValue(y);
            if (firstClick == null)
            {
                firstClick = new Location(xValue, yValue);
            }
            else
            {

                puzzle.switchGems(firstClick, new Location(xValue, yValue));
                firstClick = null;

            }

        }

    }


    // ----------------------------------------------------------
    /**
     * Place a description of your method here.
     *
     * @param puzzle
     */
    public void changeWasObserved(PuzzleGrid puzzle)
    {
        for (int i = 0; i < puzzle.size(); i++)
        {
            for (int j = 0; j < puzzle.size(); j++)
            {
                gem[i][j].getImage();

            }
            // if gems removed have new ones move
            // fall down change in x

        }

    }
}
