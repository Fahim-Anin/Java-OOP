// Write a Java program to create a class called "Person" with a name and age attribute. Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.

public class Person{
    private String name;
    private int age;
    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
        //System.out.println(name+ " " + age);
    }

    public void Setname(String name)
    {
       this.name= name;
    }
    public void SetAge(int age)
    {
        this.age=age;
    }

    public String getname()
    {
        return name;
    }
    public int getage()
    {
        return age;
    }
}