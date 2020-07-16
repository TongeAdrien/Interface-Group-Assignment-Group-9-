/*NGUYEN VU QUANG - T00643038*/
public class AngryDuck extends WaterFowl implements Teleporter
{
  public AngryDuck(String name, String primaryColor)
  {
    super(name,primaryColor);
  }

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
}