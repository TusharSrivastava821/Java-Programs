public class Box
{
    int width;
    int height;
    int depth;
    float vol;
    Box(int w, int d, int h)
    {
        width = w;
        depth = d;
        height = h;
    }
    public float volume()
    {
        vol = width*depth*height;
        return vol;
    }
}
class BoxMain
{
    public static void main(String[] args)
    {
        Box b1 = new Box(4,5,6);
        System.out.println("Volume = " + b1.volume());
    }
}