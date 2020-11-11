

import java.util.Scanner;
public class TestScoresDemo
{
    public static void main(String args[])throws Exception
    {
       int index;
       
       Scanner s = new Scanner (System.in);
       System.out.println("How many scores do you want to type in: ");
       index = s.nextInt();
       int[] scores = new int[index];
       
       for(int i=0; i<index; i++)
       {
          System.out.println("Enter score " + (i+1) +" :");
          scores[i] = s.nextInt();  
       }
       
     try
     {
        TestScores ts = new TestScores(scores);
        System.out.println("Average of the test scores: "+ ts.getAverage());
     }
     catch(InvalidTestScores e)
     {
       System.out.println("You entered an invalid number.\n"+ e.getMessage() );
     }
    }

}