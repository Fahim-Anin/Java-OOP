// Write a Java program to create a class called "Employee" with a name, job title, and salary attributes, and methods to calculate and update salary.

public class Employee{
    private String name;
    private int salary;
    
    public Employee(String name, int salary)
    {
        this.name= name;
        this.salary = salary;

    }
    public void setname_salary(String name , int salary)
    {
        this.name = name;
        this.salary= salary;
    }
    public String getname()
    {
        return name;
    }
    public int getsalary()
    {
        return salary;
    }
    public int updatesalary()
    {
        return salary+salary*10/100;
    }
}