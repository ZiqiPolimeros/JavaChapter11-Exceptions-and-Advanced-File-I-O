public class InvalidTestScores extends Exception
{
    public InvalidTestScores(int n)
    {
       super("Error:Number cannot be less than 0 and greater than 100");
    }

}