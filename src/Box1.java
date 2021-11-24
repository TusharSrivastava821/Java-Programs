// Create class box and box3d. box3d is extended class of box. 
// The above two classes going to pull fill following requirement 
// Include constructor.
// set value of length, breadth, height Find out area and volume. 
// Note: Base class and sub classes have respective methods and instance variables.

public class Box1
{
    public int length, breadth,area;
    public Box1(int length, int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
    public void area()
    {
        area = length * breadth;
    }
    public void printArea()
    {
        System.out.println("Area : " + area);
    }
}
class Box3D extends Box1
{
    public int height,volume;
    public Box3D(int length, int breadth, int height)
    {
        super(length, breadth);
        this.height = height;
    }
    public void volume()
    {
        volume = (length * breadth) * height;
    }
    public void printVolume()
    {
        System.out.println("Volume : " + volume);
    }
}
class Test2
{
    public static void main(String[] args)
    {
        Box1 obj = new Box1(7, 8);
        obj.area();
        obj.printArea();

        Box3D obj1 = new Box3D(4,5,7);
        obj1.volume();
        obj1.printVolume();
    }
}
