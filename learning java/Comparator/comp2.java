
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
    int age;
    String name;

    public Student(int age, String name){
    this.age= age;
    this.name=name;
    }

    public String toString() {
        return age + " " + name;
    }

    public void showdetails()
    {
        System.out.println("without ToString method");
        System.out.print(name + " " +age);
        System.out.print(" ");
    }
}

public class comp2{
   
public static void main(String[] args) {
   
    List<Student>stud = new ArrayList<>();
    stud.add(new Student(21, "Fahim"));
    stud.add(new Student(12, "Anin"));
    stud.add(new Student(15, "Kamal"));
   
    //   Comparator<Student>s = new Comparator<Student>()
    // {   
    //     public int compare(Student i, Student j)
    //   {
    //     if(i.age>j.age)
    //     {
    //          return 1;
    //     }
    //     else
    //      return -1;
    //   }  

    
        
     //Using lambda

      Comparator<Student>s = (Student i, Student j) ->
      {
        return i.age>j.age?1:-1;
      };
      Collections.sort(stud,s);
      System.out.println(stud);

      //without toString()
    for(Student std: stud)
    {
        std.showdetails();
    }
     
} 
    
}
