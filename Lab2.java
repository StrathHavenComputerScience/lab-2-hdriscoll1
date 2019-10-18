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
        //post Robot completes comb to make dark
  public static void darkenComb()
  {
    Robot.load("comb.txt");
    Robot.setDelay(0.05);
    
    completeComb();
    completeComb();
    completeComb();
    completeComb();
    lastStep();
    
    
  }
  //pre the area in front of Robot is light
  //post Robot moves forward and makes area dark
  public static void createDark()
  {
      Robot.move();
      Robot.makeDark();
    }
    //pre Entire row next to robot is light
    //post The robot is now at end of row, having made it dark
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
    //pre Robot is at end of dark row
    //post Robot is back at front of row
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
    //pre Robot is unable to complete comb's row in efficent number of steps
    //post Robot completes entire row in sufficent number of steps
   public static void completeComb()
    {
        rowDark();
    getBack();
    turnRight();
    Robot.move();
    Robot.makeDark();
    Robot.move();
    }
    //pre Robot is unable to complete last row without crashing
    //post Robot can successfully complete last row 
  public static void lastStep()
    {
        rowDark();
        getBack();
    }
   
    
    
    //pre The grid is completely light
    //post The gird is checkered with every other step being dark
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
  //pre The row in front of robot is completly light
  //post The robot is now at other end of row, row is checkered
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
    //pre Robot uses to many steps to right turn in fianl code
    //post Robot uses method to simplify number of steps needed
  public static void turnCheckered()
  {
      turnRight();
      Robot.move();
      turnRight();
    }
    //pre Robot uses to many steps to left turn in final code
    //post Robot uses method to simplify number of steps needed
  public static void otherCheckered()
  {
      Robot.turnLeft();
      Robot.move();
      Robot.turnLeft();
    }
}
