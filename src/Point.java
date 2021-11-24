// Create class point with following instance variable and methods. 
// Instance variable: private int x,y
// Constructors : public Point(), Point(int x, int y)
// Methods : public void setX(int x), setY(int y), setXY(int x, int y) .

import java.util.Scanner;
public class Point
{
    Scanner sc = new Scanner(System.in);
    private int x,y;
    Point()
    {
        x = sc.nextInt();
        y = sc.nextInt();
    }
    Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public void setXY(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}
