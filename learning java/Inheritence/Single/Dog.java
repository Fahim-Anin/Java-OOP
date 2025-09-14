
public class Dog extends Animal 
//inheritence Dog Child) -> Animal(Parent)
{  
    public Dog(String nm, String clr, int age)
   {

    //System.out.println("This is dog");
    super(nm);
    System.out.println(this.name + " " +clr + " " +age);

    //Output---->>>>>
    // Animal with Parameter : which comes from parent class parameterized constructor
    // rover brown 2
    
   }
}

