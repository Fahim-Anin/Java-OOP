public class Tester{
    public static void main(String[] args) {
        Person p1 = new Person("Fahim", 22);
        System.err.println(p1.getname()+ " "+p1.getage()); //prints Fahim and 22

        p1.Setname("Anin");
        p1.SetAge(25);
        int getageinreturn = p1.getage();
        String getnames= p1.getname();
        System.err.println(getageinreturn+ " "+getnames);

    }
}