// Adrien Tonge T00245172

public class CuriousBunny extends Animal 
{
     public CuriousBunny (String name, String colour)
     {
          super(name, colour);
     }
     
     public void hop()
     {
          System.out.println(super.name + " is hopping");    
     }
     
}