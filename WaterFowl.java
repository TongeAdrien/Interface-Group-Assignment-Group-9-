/*NGUYEN VU QUANG - T00643038*/
public class WaterFowl extends Animal
{
  protected boolean flyCheck;
  
  public WaterFowl(String name, String primaryColor)
  {
    super(name,primaryColor);
    flyCheck=false;
  }
  
  public void fly()
  {
    if(health==0)
    {
      System.out.println(primaryColor+" "+name+" is dead!! It cannot fly.");
    }
    else
    {
      System.out.println(primaryColor+" "+name+" is flying");
      flyCheck=true;
    }
  }
  
  public void swim()
  {
    if(health==0)
    {
      System.out.println(primaryColor+" "+name+" is dead!! It cannot swim.");
    }
    else
    {
      System.out.println(primaryColor+" "+name+" is swiming");
      flyCheck=false;
    }
  }
  
  public String checkFly()
  {
    String check;
    if(flyCheck==true)
    {
      check=primaryColor+" "+name+" is flying !";
    }
    else
    {
      check=primaryColor+" "+name+" not flying !";
    }
    return check;
  }
  
  public String toString()
  {
    return super.toString()+" "+checkFly();
  }
  
} 