// Adrien Tonge T00245172

public class CuriousBunny extends Animal implements AttackerInterface
{
     public CuriousBunny (String name, String colour)
     {
          super(name, colour);
     }
     
     public void hop()
     {
          System.out.println(super.name + " is hopping");    
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
           
           if(animal.health==1)
           {
             System.out.println(primaryColor + " " + name + " has slained " + animal.primaryColor + " " + animal.name);
             killCount++;
           }
           animal.getHit();
         }
         else
         {
           System.out.println(primaryColor + " " + name + " can not attack "+animal.primaryColor+ " " + animal.name + " beacause they are from the same kind !!");
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
       
       if(obj instanceof CuriousBunny)
         return true;
       
       return false;
     }
     
     public String toString()
     {
       return super.toString()+". The number of kills of" + primaryColor + " " +name+ ": "+getKillCount();
     }
}