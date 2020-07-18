/*Brianna Pham and Adrien Tonge, teleport functionality part*/ 
import java.awt.Point;

public interface Teleporter
{
    //Create X, Y coordinate with x:y = 1000:1000
    Point locate = new Point(1000,1000); 
    public void teleport(int x, int y);
    public String getPosition();
}