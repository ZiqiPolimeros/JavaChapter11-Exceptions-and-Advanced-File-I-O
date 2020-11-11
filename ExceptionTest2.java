
//2. Look at the following program and tell what it will output when run: 
public class ExceptionTest2 
{   
   public static void main(String[] args)   
   {      
     int number;      
     String str;
     
       try      
       {         
          str = "xyz";         
          number = Integer.parseInt(str);         
          System.out.println("A");      
       }      
       catch(NumberFormatException e)      
       {         
          System.out.println("B");      
       }      
       catch(IllegalArgumentException e)      
       {         
          System.out.println("C");      
       }      
       finally      
       {         
         System.out.println("D");      
       }
    System.out.println("E");   
} 
}