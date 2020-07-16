/*NGUYEN VU QUANG - T00643038*/
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
          if (x <=1000 && y<1000 && x>0 && y >500)
          {
               bunnyY = y;
               bunnyX = x;
          }
          else
          {
               System.out.println("Teleport failed");
               
          }
     }
     public String getPosition()
     {
          String position = (bunnyX+","+bunnyY);
          return position;
     }
}