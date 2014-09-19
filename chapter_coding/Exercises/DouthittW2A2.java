





// Richard Kick
// 7-18-2000
// A simple function grapher applet

import java.awt.Graphics;
import java.lang.Double;
import java.awt.Color;

public class DouthittW2A2 extends java.applet.Applet
{
  private double myA;
  private double myB;
  private double myC;
  private double myD;
  private double myXmin;
  private double myXmax;
  private double myYmin;
  private double myYmax;
  private double myYUnitPixels;
  private double myXUnitPixels;

  private int myWidth;
  private int myHeight;
  private int myTicSize;
  private int myXAxisVPos;
  private int myYAxisHPos;

  public void init()
  {
    myA = Double.parseDouble( getParameter("A") ); // static member function
    myB = Double.parseDouble( getParameter("B") ); // of Integer class
    myC = Double.parseDouble( getParameter("C") );
    myD = Double.parseDouble( getParameter("D") );
    myXmin = Double.parseDouble( getParameter("xmin") );
    myXmax = Double.parseDouble( getParameter("xmax") );
    myYmin = Double.parseDouble( getParameter("ymin") );
    myYmax = Double.parseDouble( getParameter("ymax") );
    myWidth  = getSize().width;
    myHeight = getSize().height;
    myTicSize = 2;
    myYUnitPixels = 0;
    myXUnitPixels = 0;
    myXAxisVPos = 0;
    myYAxisHPos = 0;
  }

  private void drawAxes(Graphics g)
  {
    myYUnitPixels = (double) myHeight / (myYmax - myYmin);
    myXUnitPixels = (double) myWidth  / (myXmax - myXmin);
    myXAxisVPos = (int) (myYmax * myYUnitPixels);
    myYAxisHPos = (int) (-myXmin * myXUnitPixels);
    g.drawLine(0, myXAxisVPos, myWidth, myXAxisVPos);
    g.drawLine(myYAxisHPos, 0, myYAxisHPos, myHeight);

    for (int lp = myYAxisHPos; lp < myWidth; lp += myXUnitPixels)
    {
      g.drawLine(lp, myXAxisVPos-myTicSize, lp, myXAxisVPos+myTicSize);
    }
    for (int lp = myYAxisHPos; lp > 0; lp -= myXUnitPixels)
    {
      g.drawLine(lp, myXAxisVPos-myTicSize, lp, myXAxisVPos+myTicSize);
    }

    for (int lp = myXAxisVPos; lp < myHeight; lp += myYUnitPixels)
    {
      g.drawLine(myYAxisHPos-myTicSize, lp, myYAxisHPos+myTicSize, lp);
    }
    for (int lp = myXAxisVPos; lp > 0; lp -= myYUnitPixels)
    {
      g.drawLine(myYAxisHPos-myTicSize, lp, myYAxisHPos+myTicSize, lp);
    }
  }

  private double f(double x) // uses Math static member function sin
  {
    return myA * Math.sin( myB * x + myC) + myD;
  }

  public void paint(Graphics g)
  {
    setBackground(Color.red);  // call Applet method setBackground and
    drawAxes(g);		  // access class Color static data yellow
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

