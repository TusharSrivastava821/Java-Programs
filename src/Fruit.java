// Create a base class Fruit which has name, taste and size as its attributes.
// A method called eat() is created which describes the name of the fruit and its taste. 
// Inherit the same in 2 other classes Apple and Orange and override the eat() method to represent each fruit taste.

public class Fruit
{
    String name;
    String taste;
    String size;
    public void eat()
    {
        
    }
}
class Apple extends Fruit
{
    @Override
    public void eat()
    {
        name="Apple";
        taste="Apple Taste";
        size="Size of Apple";
    }
}
class Orange extends Fruit
{
  @Override
  public void eat()
  {
      name="Orange";
      taste="Orange taste";
      size="Size of Orange";
  }
}