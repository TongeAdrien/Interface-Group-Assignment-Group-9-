// Adrien Tonge T00245172

public class WaterFowl extends Animal 
{
     public WaterFowl (String name, String colour)
     {
          super(name, colour);
     }
     
     public void fly()
     {
          System.out.println(super.name + " " + "is flying");   
     }
     public void swim()
     {
          System.out.println(super.name + " " + "is swimming");     
     }
}