public class Student{
    public String name;
    private int id;
    protected double age;

public Student(String nm, int a, double b)

{
    name = nm;
    id=a;
    age=b;

}


public void showdetails(){
    System.out.println(name);
    System.out.println(id);
    System.out.println(age);
    //OOUTPUT
    //Fahim
    //29
    //56.5
}

private double  calculatecgpa()
{
    return 4.0;
}

//method for accessing the private member
public  void SetId(int id)
{   if(id>0)
    {
        this.id =id;
    //System.out.println(id); //it prints the local variable
    getId();
    }
    else{
        System.out.println("INvalid id");
    }
}
public void getId()
{   
    double cg = calculatecgpa();
    System.out.println(cg);
    System.out.println(this.id);
    //OUTPUT   
    //4.0
    //33
}

}