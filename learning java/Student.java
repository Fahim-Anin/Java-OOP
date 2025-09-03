public  class Student {
    public String name;
    public String id ="112";
    public int cgpa; //this cgpa is instance variable
    
    public void showdetails(String id) //instance method
{
    System.out.println(name);
    this.id = id; //update the value of instance variable of local variable declares in Tester file
    System.out.println(id); //this one prints the local variable value 
   
    System.out.println(this.id); //this one prints the updated instance variable value. both of the value should be same
}
public void  increasecgpa(int cgpa)
{ //cg is local variable..  and cgpa is also a local variable
   cgpa =cgpa+cgpa; //this refers to the local variable so will print 7+7=14
   System.out.println(cgpa);

   System.out.println(this.cgpa);  //this cgpa refers to the instance variable . so this willprint 5. This is called variable shadowing
}
}
