/*Brianna Pham and Adrien Tonge, teleport part*/
public class AngryDuck extends WaterFowl implements Teleporter
{
  public AngryDuck(String name, String primaryColor)
  {
    super(name,primaryColor);
  }

 private int duckX,duckY;
     
     public void teleport (int x, int y)
     {
          if (x > 0 && x <=locate.getX() && y >0 && y<((locate.getY())/2))
          {
               duckY = y;
               duckX = x;
               System.out.println("Teleport successful!");
          }
          else
          {
               System.out.println("Teleport failed. It stays at the same location on the map!");
               
          }
     }
     public String getPosition()
     {
          String position = ("x =" + " " + duckX+","+ " " + "y =" + " " +duckY);
          return position;
     }
}