// Adrien Tonge T00245172

public class AngryDuck extends WaterFowl implements Teleporter
{
     private int duckX,duckY;
     
     public void teleport (int x, int y)
     {
          if (x <=1000 && y<500 && x>0 && y >0)
          {
               duckY = y;
               duckX = x;
          }
          else
          {
               System.out.println("Teleport failed");
               
          }
     }
     public String getPosition()
     {
          String position = (duckX+","+duckY);
          return position;
     }

public AngryDuck (String name, String colour)
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