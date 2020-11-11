/*
2. TestScores class custom Exception 
Write an exception class named InvalidTestScore. 
Modify the TestScores class you wrote in Programming Challenge 1 
so that it throws an InvalidTestScore exception if any of the test scores in the array are invalid.
*/


public class TestScores
{
  private int[] scores;
  private double average;
  
  public TestScores(int[] scores)throws InvalidTestScores
  {
     for(int i = 0; i<5; i++)
     {
        if(scores[i]<0 || scores[i]>100)
           throw new InvalidTestScores(scores[i]);
        else
           this.scores = scores;
     }
     
     this.average = setAverage(scores);
  }
  public double setAverage(int[] scores)
  {
    int total=0;
    
    for(int i=0; i<scores.length; i++)
    {
    
       total += scores[i];
     }
     return (total/scores.length);
     
  }
  public double getAverage()
  {
    return average;
  }

     
  }
