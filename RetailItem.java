/*
4. RetailItem class 
Write a class named RetailItem that holds data about an item in a retail store. 
The class should have the following fields: 
•	description. 
The description field references a String object 
that holds a brief description of the item. 
•	unitsOnHand. 
The unitsOnHand field is an int variable 
that holds the number of units currently in inventory. 
•	price. 
The price field is a double that holds the item’s retail price. 

Write a constructor that accepts arguments for each field, 
appropriate mutator methods that store values in these fields, 
and accessor methods that return the values in these fields. 

Once you have written the class, write a separate program 
that creates three RetailItem objects and stores the following data in them:

        Description       Units on Hand      Price 
Item	#1 Jacket           12                 59.95 
Item	#2 Designer Jeans   40                 34.95 
Item	#3 Shirt            20                 24.95
*/

public class RetailItem
{
   private String description;
   private int unitsOnHand;
   private double price;
   
   public RetailItem(String description, int unitsOnHand, double price)throws InvalidPrice, InvalidUnits
   {
       this.description = description;
       if (unitsOnHand<0)
           throw new InvalidUnits;
       else
           this.unitsOnHand = unitsOnHand;
       if(price<0)
           throw new InvalidPrice;
       else
           this.price = price;
   }
   public void setDescription(String description)
   {
      this.description = description; 
   }
   public void setUnitsOnHand(int unitsOnHand)
   {
       if (unitsOnHand<0)
           throw new InvalidUnits;
       else
           this.unitsOnHand = unitsOnHand;
   }
   public void setPrice(double price)
   {
       if(price<0)
           throw new InvalidPrice;
       else
           this.price = price;
   }
   public String getDescription()
   {
       return description;
   }
   public int getUnitsOnHand()
   {
       return unitsOnHand;
   }
   public double getPrice() 
   {
       return price;
   }
   public String toString()
   {
       return description + "   "+unitsOnHand +"           "+price;
   }

}

