import java.awt.Graphics;

public class DouthittW2A1 extends java.applet.Applet
{
  private int    myWidth;
  private int    myHeight;
  private int    myTicSize;
  private double myYUnitPixels;
  private double myXUnitPixels;
  private int    myXAxisVPos;
  private int    myYAxisHPos;

  public void init()
  {
    myWidth  = getSize().width;	// get this Applet size
    myHeight = getSize().height;
    myTicSize = 2;
    myYUnitPixels = 0;
    myXUnitPixels = 0;
    myXAxisVPos = 0;
    myYAxisHPos = 0;
  }

  private void drawAxes(Graphics g, double xmin, double xmax,
                                    double ymin, double ymax)
  {

    myYUnitPixels = (double) myHeight / (ymax - ymin);
    myXUnitPixels = (double) myWidth  / (xmax - xmin);
    myXAxisVPos   = (int) (ymax * myYUnitPixels);
    myYAxisHPos   = (int) (-xmin * myXUnitPixels);
    g.drawLine(0, myXAxisVPos, myWidth, myXAxisVPos);
    g.drawLine(myYAxisHPos, 0, myYAxisHPos, myHeight);
							// formatting to save trees
    for (int lp = myYAxisHPos; lp < myWidth; lp += myXUnitPixels)
      g.drawLine(lp, myXAxisVPos-myTicSize, lp, myXAxisVPos+myTicSize);
    for (int lp = myYAxisHPos; lp > 0; lp -= myXUnitPixels)
      g.drawLine(lp, myXAxisVPos-myTicSize, lp, myXAxisVPos+myTicSize);

    for (int lp = myXAxisVPos; lp < myHeight; lp += myYUnitPixels)
      g.drawLine(myYAxisHPos-myTicSize, lp, myYAxisHPos+myTicSize, lp);
    for (int lp = myXAxisVPos; lp > 0; lp -= myYUnitPixels)
      g.drawLine(myYAxisHPos-myTicSize, lp, myYAxisHPos+myTicSize, lp);
  }

  private double f(double x)
  {
    return ( 2.0 * Math.tan(x) + Math.tan(0.5 * x) );
  }

  public void paint(Graphics g)
  {
    drawAxes(g, 7.0, 11.4, -3.0, 9.0);
    double xCoord, yCoord;
    int yPixel;
    for (int xPixel = 0 ; xPixel < myWidth; xPixel++)
    {
      xCoord = (double) (xPixel - myYAxisHPos) / myXUnitPixels;
      yCoord = f(xCoord);
      yPixel = (int) (myXAxisVPos - yCoord * myYUnitPixels);
      g.drawLine(xPixel, yPixel, xPixel, yPixel);
    }
  }
}

