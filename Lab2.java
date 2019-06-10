public class Lab2
{
    //pre Robot would have to trun left three times
    //post Robot can trun right
    public static void turnRight()
    {
        Robot.turnLeft();
        Robot.turnLeft();
        Robot.turnLeft();
    }
    //pre Robot sits in dark area
    //post Robot 'cleans' the square
  public static void cleanSquare()
  {
    Robot.load("square.txt");
    Robot.setDelay(0.1);
   
    rowLight();
    rowLight();
    rowLight();
    rowLight();
    
    
       
    
  }
  //pre Robot moves along line
  //post when Robot moves acorss dark area it makes it light
   public static void createLight()
   {
       Robot.move();
       if (Robot.onDark())
       {Robot.makeLight();}
    }
    //pre Robot cannot make area light
    //post Robot makes entire row the lighter color
    public static void rowLight()
    {
          createLight();
          createLight();
          createLight();
          createLight();
          createLight();
          createLight();
          Robot.turnLeft();
        }
        //pre comb is light
        //post comb is dark, robot is at top
  public static void darkenComb()
  {
    Robot.load("comb.txt");
    Robot.setDelay(0.05);
    
    completeComb();
    completeComb();
    completeComb();
    completeComb();
    completeComb();
    
    //pre block is set to light color
    //post block is dark
  }
  public static void createDark()
  {
      Robot.move();
      Robot.makeDark();
    }
    //pre a single row is light color
    //post a single row is dark color
  public static void rowDark()
  {
      turnRight();
      Robot.makeDark();
      createDark();
      createDark();
      createDark();
      createDark();
      createDark();
      createDark();
    }
    //pre robot returns to starting column
    //post robot returns to starting column
  public static void getBack()
  {
      Robot.turnLeft();
      Robot.turnLeft();
      Robot.move();
      Robot.move();
      Robot.move();
      Robot.move();
      Robot.move();
      Robot.move();
    }
    //pre entire comb is lighter color
    //post entire comb is darker color
    public static void completeComb()
    {
        rowDark();
    getBack();
    turnRight();
    Robot.move();
    Robot.makeDark();
    Robot.move();
    }
    //pre grid is blank
    //post grid is checkered with alternating white and black
  public static void makeCheckered()
  {
    Robot.load("blank.txt");
    Robot.setDelay(0.05);
    
    rowCheckered();
    turnCheckered();
    rowCheckered();
    otherCheckered();
    rowCheckered();
    turnCheckered();
    rowCheckered();
    otherCheckered();
    rowCheckered();
    turnCheckered();
    rowCheckered();
    otherCheckered();
    rowCheckered();
    turnCheckered();
    rowCheckered();
    
    
  }
    //pre one row is blank
    //post one row is checkered
    
  public static void rowCheckered()
  {
      Robot.move();
      Robot.makeDark();
      Robot.move();
      Robot.move();
      Robot.makeDark();
      Robot.move();
      Robot.move();
      Robot.makeDark();
      Robot.move();
      Robot.move();
      Robot.makeDark();
    }
    //pre the robot is on the completed checkered row 
    //post the robot is ready to complete next row
  public static void turnCheckered()
  {
      turnRight();
      Robot.move();
      turnRight();
    }
    //pre the robot is on the completed checkered row 
    //post the robot is ready to complete next row 
  public static void otherCheckered()
  {
      Robot.turnLeft();
      Robot.move();
      Robot.turnLeft();
    }
}
