/*NGUYEN VU QUANG - T00643038*/
public class WaterFowl extends Animal implements AttackerInterface
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
  
    public void hit(Animal animal)
  {
    if(health==0)
    {
      System.out.println(primaryColor+ " " + name + " can not perform the attack because it's dead !!");
    }
    else
    {
      if(!checkAnimal(animal))
      {
        System.out.println(primaryColor+" "+name+" is attacking "+ animal.primaryColor+" "+ animal.name);
        animal.getHit();        
        if(animal.health==0)
        {
          System.out.println(primaryColor + " " + name + " has slained " + animal.primaryColor + " " + animal.name);
          killCount++;
        }
      }
      else
      {
        System.out.println(primaryColor + " " + name + " can not attack "+animal.primaryColor+ " " + animal.name + " because this animal is its kind !!");
      }
    }
  }
  
  public int getKillCount()
  {
    return killCount;
  }
  
  public boolean checkAnimal (Object obj)
  {
    if(obj==null)
      return false;
    
    if(obj instanceof WaterFowl)
      return true;
    
    return false;
  }
  
  public String toString()
  {
    return super.toString()+" "+ checkFly()+". The number of kills of " + primaryColor + " " +name+ ": "+getKillCount();
  }
} 