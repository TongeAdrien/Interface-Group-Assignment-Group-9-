/*Brianna Pham and Adrien Tonge, teleport functionality added*/
public class CuriousBunny extends Animal implements Teleporter
{
  public CuriousBunny(String name, String primaryColor)
  {
    super(name,primaryColor);
  }
  
  public void hop()
  {
    if(health==0)
    {
      System.out.println(primaryColor+" "+name+"  is dead!! It cannot hop.");
    }
    else
    {
      System.out.println(primaryColor+" "+name+" is hoping.");
    }
  }

  private int bunnyX,bunnyY;
     
  public void teleport (int x, int y)
     {
          if (x> 0 && x <= locate.getX() && y >((locate.getY())/2) && y<locate.getY())
          {
               bunnyY = y;
               bunnyX = x;
               System.out.println("Teleport successful!");
          }
          else
          {
               System.out.println("Teleport failed. It stays at the same location on the map!");
               
          }
     }
  public String getPosition()
     {
          String position = ("x =" + " " + bunnyX+","+ " " + "y =" + " " + bunnyY);
          return position;
     }
}