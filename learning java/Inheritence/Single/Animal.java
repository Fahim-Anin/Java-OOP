public class Animal{
    public String name;
    public Animal(){
        System.out.println("This is animal");
    }

    public Animal(String nm)
    {
        name = nm;
        System.out.println("Animal with paramter");
    }
    public void eat()
    {
        System.out.println(name+ " " +"will eat");
    }
}