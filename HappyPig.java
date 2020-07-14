// Adrien Tonge T00245172

public class HappyPig extends Animal 
{
     public HappyPig (String name, String colour)
     {
          super(name, colour);
     }
     public void roll()
     {
          System.out.println(super.name + " is rolling");    
     }
     public void sleep()
     {
          System.out.println(super.name + " is sleeping");    
     }
}