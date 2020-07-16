/*NGUYEN VU QUANG - T00643038*/
public class LoudGoose extends WaterFowl implements AttackerInterface
{
  public LoudGoose(String name, String primaryColor)
  {
    super(name,primaryColor);
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
        System.out.println(primaryColor+" "+name+" is attacking "+animal.primaryColor+" "+animal.name);
        animal.getHit();        
        if(animal.health==0)
        {
          System.out.println(primaryColor + " " + name + " has slained " + animal.primaryColor + " " + animal.name);
          killCount++;
        }
      }
      else
      {
        System.out.println(primaryColor + " " + name + " can not attack "+animal.primaryColor+ " " + animal.name + "beacause this animal is its kind !!");
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
    
    if(obj instanceof LoudGoose)
      return true;
    
    return false;
  }
  
  public String toString()
  {
    return super.toString()+". The number of kills of " + primaryColor + " " +name+ ": "+getKillCount();
  }
}