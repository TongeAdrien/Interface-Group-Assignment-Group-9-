// Adrien Tonge T00245172

public abstract class Animal
{
     public static int animalCount = 0; 
     protected String name;
     protected String colour;
     protected int health = 3;
     
     public Animal (String name, String colour)
     {
          this.name = name;
          this.colour =colour;
          animalCount++;
     }
     
     public void takeHit()
     {
          if (health >1)
          {
               health --;
               System.out.println(name + " has " + getHealth()+ " health remaining"); 
          }
          else 
          {
               animalCount--;
               System.out.println(name + " is dead");
          }
     }
     
     public void setAnimalCount(int newCount)
     {
          animalCount = newCount;
     }
     
     public int getAnimalCount()
     {
          return animalCount;  
     }
     public void setHealth(int hp)
     {
          health = hp;
     }
     
     public int getHealth()
     {
          return health;
     }
     
     public String getName()
     {
          return name;    
     }
     
     
     public String getColour()
     {
          return colour;    
     }
     
     
     public void setName (String newName)
     {
          name = newName;    
     }
     
     
     public void setColour(String newColour)
     {
          colour =newColour;
     }
     
     
}