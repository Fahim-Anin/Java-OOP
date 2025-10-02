
// class Computer{
//     public void code()
//   {
    
//   }
// }


//with abstract class
abstract class Computer{
  public abstract void  code();
}

//with interface
// interface Computer{
//   void code();
//   in this case all the extends should be changed in implements
// }

class Laptop extends  Computer{
  public void code()
  {
    System.out.println("Code, Compile laptop");
  }
}

class Desktop extends  Computer{
   public void code()
  {
    System.out.println("Code, Compile desktop ");
  }
}
class Developer{
    public void devApp(Computer lap)
    {
       lap.code();
    }
}

public class interfaces{
  public static void main(String a[])
  {  

    // Laptop lap = new Laptop();
    // Desktop desk = new Desktop();
    Computer lap = new Laptop();
    Computer desk= new Desktop();
    Developer dev = new Developer();
    dev.devApp(desk);

  }
}