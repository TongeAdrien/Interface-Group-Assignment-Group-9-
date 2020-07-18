
public class HappyPig extends Animal
{
  public HappyPig(String name, String primaryColor)
  {
    super(name,primaryColor);
  }
  
  public void sleep()
  {
    if(health==0)
    {
      System.out.println(primaryColor+" "+name+" is dead!! It is in an eternal sleep. ");
    }
    else
    {
    System.out.println(primaryColor+" "+name+" is sleeping");
    }
  }
  
  public void roll()
  {
    if(health==0)
    {
      System.out.println(primaryColor+" "+name+" is dead!! It cannot fly.");
    }
    else
    {
    System.out.println(primaryColor+" "+name+" is rolling");
    }
  }
}