public class AnimalGame2 
{
  public static void main(String[] arg)
  {
    CuriousBunny bunny1 = new CuriousBunny("Bunny 1", "White");
    CuriousBunny bunny2 = new CuriousBunny("Bunny 2", "Yellow");
    
    LoudGoose goose1 = new LoudGoose("Goose 1", "White");
    LoudGoose goose2 = new LoudGoose("Goose 2", "Pink");

    AngryDuck duck1 = new AngryDuck("Duck 1", "Green");
    AngryDuck duck2 = new AngryDuck("Duck 2", "Brown");

    HappyPig pig1 = new HappyPig("Pig 1", "Black");
    HappyPig pig2 = new HappyPig("Pig 2", "Red");

    
    System.out.println();
    //The goose cannot attack his kind and can attack other characters
    goose2.hit(goose1);
    goose2.hit(bunny1);
    
    System.out.println();
    
    //Goose 2 cannot attack other characters when we set his health to 0
    goose2.setHealth(0);
    goose2.hit(bunny2);
    
    System.out.println(bunny1);
    System.out.println(goose2);

    System.out.println();

    //We use Duck 1 and Duck 2 to attack Pig 1 to check the KillCount
    duck1.hit(pig1);
    duck2.hit(pig1);
    duck1.hit(pig1);
    System.out.println(pig1);
    System.out.println(duck1);

    System.out.println();

    //Testing teleport functionality
    System.out.println("Bunny 1 wants to teleport to the new location!");
    bunny1.teleport(50,600);
    System.out.println("Bunny 1' location: " + bunny1.getPosition());
    System.out.println("Bunny 2 wants to teleport to the new location!");
    bunny2.teleport(1000,230);
    System.out.println("Bunny 2' location: " + bunny2.getPosition());

    System.out.println("Duck 1 wants to teleport to the new location!");
    duck1.teleport(60,170);
    System.out.println("Duck 1' location: " + duck1.getPosition());
    System.out.println("Duck 2 wants to teleport to the new location!");
    duck2.teleport(1200,400);
    System.out.println("Duck 2' location: " + duck2.getPosition());

    System.out.println();

    //Check the current health and kill count after the fight
    System.out.println(duck1.toString());
    System.out.println(duck2.toString());
    System.out.println(bunny1.toString());
    System.out.println(bunny2.toString());
    System.out.println(goose1.toString());
    System.out.println(goose2.toString());
    System.out.println(pig1.toString());
    System.out.println(pig2.toString());
  }
}