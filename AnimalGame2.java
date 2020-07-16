public class AnimalGame2
{
  public static void main(String[] arg)
  {
    CuriousBunny bunny1 = new CuriousBunny("Bunny 1", "White");
    CuriousBunny bunny2 = new CuriousBunny("Bunny 2", "Yellow");
    
    LoudGoose goose1 = new LoudGoose("Goose 1", "White");
    LoudGoose goose2 = new LoudGoose("Goose 2", "Pink");
    
    System.out.println();
    
    goose2.hit(goose1);
    goose2.hit(bunny1);
    
    System.out.println();
    
    goose2.setHealth(0);
    goose2.hit(bunny2);
    
    System.out.println(bunny1);
    System.out.println(goose2);
  }
}