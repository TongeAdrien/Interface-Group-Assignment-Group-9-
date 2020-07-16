import java.awt.Point;
public interface Teleporter
{
  Point locate = new Point(1000,1000);
 public void teleport(int x, int y);
 public String getPosition();
}