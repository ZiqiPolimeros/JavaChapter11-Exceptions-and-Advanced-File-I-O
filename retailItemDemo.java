/*
3. RetailItem Exceptions 
Programming Challenge 4 of Chapter 6 required you to write a RetailItem class 
that holds data pertaining to a retail item. 
Write an exception class that can be instantiated 
and thrown when a negative number is given for the price. 
Write another exception class that can be instantiated 
and thrown when a negative number is given for the units on hand. 
Demonstrate the exception classes in a program.
*/

public class retailItemDemo
{
   public static void main (String[]args)
   {
      try{
      RetailItem r1 = new RetailItem ("Jacket",12,59.95);
      RetailItem r2 = new RetailItem("Designer Jeans",40,34.95);
      RetailItem r3 = new RetailItem("Shirt",20,24.95);
      
      System.out.println("Description   Units on Hand   Price");
      System.out.println("------------------------------------");
      System.out.println("        "+r1);
      System.out.println(r2);
      System.out.println("         "+r3);
      }
      catch(InvalidPrice e)
      {
         System.out.println(e.getMessage());
      }
      catch(InvalidUnits e)
      {
         System.out.println(e.getMessage());
      }
   }

}