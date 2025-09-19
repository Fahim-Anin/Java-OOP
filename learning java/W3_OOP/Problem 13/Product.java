// Write a Java program to create a class called "Inventory" with a collection of products and methods to add and remove products, and to check for low inventory.
public class Product{
   public String component;
   public int piece;
   

   public Product(String component, int piece )
   {
    this.component=component;
    this.piece = piece;
   }

   public void quantity()
   {
    if(piece >=100)
    {
        System.out.println(component + " " + "inventory is Ok and the piece is: " +piece );
        
        System.out.println(p1.component); //here p1.component gives compile time error because quantity doesnot know what is p1 as in this scope there is no p1.
//    When you call p1.quantity(), the JVM does two things: It finds the p1 object in memory.

// It calls the quantity() method and secretly passes a reference to the p1 object as a hidden parameter.

// Inside the quantity() method, this hidden reference is known as the this keyword. So, the method has a direct link to the specific object it was called on, allowing it to access that object's instance variables like component and piece.
   
   
    }
    else{
        System.out.println(component +" " + "inventory is low and the piece is: " +piece );
    }
   }
}