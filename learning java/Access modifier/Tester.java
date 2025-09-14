public class Tester{
    public static void main(String[] args) {
    Student s1 = new Student("Fahim", 29, 56.5);
    s1.showdetails();

    //System.out.println(s1.name);
    //System.out.println(s1.age);
    //System.out.println(s1.id); // this will not print because this is private member of student class. to access this we need to use a method 
    
    s1.SetId(33);

    //int currentid = s1.getId();
    //System.out.println(currentid);
    }
}