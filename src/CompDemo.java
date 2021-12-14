import java.util.Comparator;
import java.util.TreeSet;

public class CompDemo
{
   public static void main(String[] args)
   {
       TreeSet<Integer> obj= new TreeSet(new Mysort());
       obj.add(10);
       obj.add(23);
       obj.add(6);
       obj.add(4);
       obj.add(4);
       System.out.println(obj);
   }
}
class Mysort implements Comparator<Integer>
{
  @Override
  public int compare(Integer o1,Integer o2)
  {
      Integer i1= (Integer) o1;
      Integer i2= (Integer) o2;
      if(i1>i2)
      {
          return -1;
      }
      else if(i1<i2)
      {
        return +1;
      }
      return 0;
  } 
}