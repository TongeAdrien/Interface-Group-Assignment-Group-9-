// Adrien Tonge T00245172

public class LoudGoose extends WaterFowl
{
     public LoudGoose (String name, String colour)
     {
          super(name, colour);
     }
     public void swim()
     {
          System.out.println(super.name + " is swimming");    
     }
     public void fly()
     {
          System.out.println(super.name + " is flying");    
     }
}