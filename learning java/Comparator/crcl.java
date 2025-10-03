
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
// The Student class NOW knows how to sort itself by ID
class Student implements Comparable<Student> { // Step 1: Implement the interface
    int studentId;
    String name;

     public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    // Step 2: Override the compareTo method
    @Override
    public int compareTo(Student otherStudent) {
        // This is the core logic. We are comparing THIS student's ID
        // to the OTHER student's ID.

        if (this.studentId > otherStudent.studentId) {
            return 1;  // This object is "greater than" the other object
        } else if (this.studentId < otherStudent.studentId) {
            return -1; // This object is "less than" the other object
        } else {
            return 0;  // The objects are "equal"
        }
    }

  @Override
    public String toString() {
        return "ID: " + studentId + ", Name: " + name;
    }

}

public class crcl{
    public static void main(String[] args) {
    List<Student>stud = new ArrayList<>();
    stud.add(new Student(21, "Fahimgum"));
    stud.add(new Student(29, "Aninsdsddsd"));
    stud.add(new Student(15, "Kamal"));
        Comparator<Student>s = (Student i, Student j) ->
      {
        return i.name.length()<j.name.length()?1:-1;
      };

    Collections.sort(stud,s); 
    Collections.sort(stud);
    System.out.println(stud);
     
    }
}
