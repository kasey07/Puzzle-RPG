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

    private PuzzleGrid         puzzle;
    private int                length;
    private ShapeView          shapeView;
    private RectangleShape[][] gem;


    // ----------------------------------------------------------
    /**
     * Initialize the battle screen
     */
    public void initialize()
    {

        puzzle = new PuzzleGrid(6);
        puzzle.addObserver(this);
        this.length =
            (Math.min(shapeView.getHeight(), shapeView.getWidth()) / 6) / 2;
        this.gem = new RectangleShape[6][6];
        setupScreen();
    }


    private void setupScreen()
    {

        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 8; j++)

            {
                RectangleShape square =
                    new RectangleShape(
                        length * j,
                        length * i,
                        length * (j + 1),
                        length * (i + 1));

                square.setColor(Color.black);

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
        RectangleShape tile =
            this.getShapes().locatedAt(x, y).withClass(RectangleShape.class)
                .front();

        if (tile != null)
        {
            int yValue = getValue(x);
            int xValue = getValue(y);
            Location location = new Location(xValue, yValue);


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
        // Run through puzzle and see if gems have changed update location of
// new gems
        // if gems removed have new ones move
        // fall down change in x

    }

}
