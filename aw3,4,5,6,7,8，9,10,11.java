/*
Write a method that searches a numeric array for a specified value. 
The method should return the subscript of the element containing the value if it is found in the array. 
If the value is not found, the method should throw an exception of the Exception class 
with the error message “Element not found”.
*/
public class aw3
{
public int arraySearch(int[] array, int value)throws Exception
{
   int i=0;
   int element=-1;
   boolean found=false;
   
   while(!found && i<array.length)
   {
      if(array[i] == value)
      {
        found = true;
        element = i;
      }
      i++;
   }
   if (element == -1)
      throw new Exception("Element not found.");
   else
      return element;
}    
}

/*
4. Write a statement that throws an IllegalArgumentException 
with the error message “Argument cannot be negative”.
*/
int number = -112;
if(number<0)
    throw new IllegalArgumentException(“Argument cannot be negative”);
    
/*
 5. Write an exception class that can be thrown when a negative number is passed to a method.
 */
 
 public class NegativeNumber extends Exception
 {
   public NegativeNumber()
   {
     super("Error: Negative number");
   }
   public NegativeNumber(int n){
      super("Error: Negative number"+ n);
   }
}
//not finished yet

/*
6. Write a statement that throws an instance of the exception class 
that you created in Algorithm Workbench 5.
*/
NegativeNumber obj = new NegativeNumber(-123);

/*
7. The method getValueFromFile is public and returns an int. 
It accepts no arguments. 
The method is capable of throwing an IOException and a FileNotFoundException. 
Write the header for this method.
*/
public int getValueFromFile()
       throws IOException,FileNotFoundException
       
/*
8. Write a try statement that calls the getValueFromFile method described in Algorithm Workbench 7. 
Be sure to handle all the exceptions that the method can throw.
*/
try
{
  int value = getValueFromFile();
}
catch(FileNotFoundExcetion e)
{
  System.out.println(e.getMessage());
}
catch(IOEception e)
{
  System.out.println(e.getMessage());
}

/*
 9. Write a statement that creates an object 
 that can be used to write binary data to the file Configuration.dat.
 */
 FileOutputStream fstream = new FileOutputStream("Configuration.dat");
 
 /*
 10. Write a statement that opens the file Customers.dat 
 as a random access file for both reading and writing.
 */
 
 RandomAccessFile randomFile = new RandomAccessFile("Customer.dat","rw");
 
 /*
 11. Assume that the reference variable r refers to a serializable object. 
 Write code that serializes the object to the file ObjectData.dat.
 */
 
 FileOutputStream file = new FileOutputStream("ObjectData.dat");
 ObjectOutputStream object = new ObjectOutputStream(file);
 objectOutputFile.writeObject(r);