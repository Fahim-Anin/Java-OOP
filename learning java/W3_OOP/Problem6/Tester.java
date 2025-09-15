public class Tester{
    public static void main(String[] args) {
        Employee e1= new Employee("Fahim", 10000);
        System.out.println(e1.getname()+ " " +e1.getsalary());
        System.out.println(e1.updatesalary());
    }
}