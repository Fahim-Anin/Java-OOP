public class Tester{
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2= new Student();
       Course c1= new Course("MATH1112", 1112);
       Course c2= new Course("cse1122", 1234);
       Course c3 = new Course("cse3223", 33434);
       s1.addcourse(c1); //passing the reference of course object
       s1.addcourse(c2);
       s2.addcourse(c3);
       s1.showcourse();
       s2.showcourse();

       //output
// Course@251a69d7
// 1112
// MATH1112
// Course@7344699f for
// 1234
// cse1122
// Course@6b95977  for s2
// 33434
// cse3223

    }
}