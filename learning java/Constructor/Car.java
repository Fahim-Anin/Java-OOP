public class Car{
    public String brand;
    public int model;

//default constructor
public Car()
{
  System.out.println("Car without parameter is printed");
}

public Car(String brand, int model)
{
    this.brand=brand;
    this.model=model;
    System.out.println(brand);
    System.out.println("-------");
    System.out.println(this.brand);
    
    System.out.println(model);


// Audi    //this is local variable of constructor
// -------
// Audi  //this is instance variable
// 2003  //this is local variable of constructor


}
}