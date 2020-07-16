/*NGUYEN VU QUANG - T00643038*/
public abstract class Animal
{
  protected int health;
  protected String primaryColor;
  protected String name;
  protected static int count=0;
  protected int killCount=0;
  
  public Animal()
  {
    name="";
    primaryColor="";
    count++;
    health=3;
  }
  
  public Animal(String name, String primaryColor)
  {
    this.name=name;
    this.primaryColor=primaryColor;
    count++;
    health=3;
  }
  
  public void getHit()
  {
    if(health>0)
    {  
      health--;
      System.out.println("Ouch! "+primaryColor+" "+name+" was taking a hit!!");
    }
    else
    {
      System.out.println(primaryColor+" "+name+" is dead!!");
      count--;
    }
  }
  
  public String getName()
  {
    return name;
  }
  
  public void setName(String name)
  {
    this.name=name;
  }
  
  public int getHealth()
  {
    return health;
  }
  
  public void setHealth(int health)
  {
    this.health=health;
  }
  
  public String getColor()
  {
    return primaryColor;
  }
  
  public void setColor(String primaryColor)
  {
    this.primaryColor=primaryColor;
  }
  
  public static int getCount()
  {
    return count;
  }
  
  public String toString()
  {
    return primaryColor+" "+name+" has "+health+" health.";
  }
}

