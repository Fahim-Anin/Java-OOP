public class Tester{
    public static void main(String[] args) {
        Car c1= new Car();
        //this new car calls the constructor and prints "Car without parameter is printer"
        System.out.println(c1);
        c1= new Car();
        System.out.println(c1);

// Car without parameter is printed
// Car@7ad041f3
// Car without parameter is printed
// Car@251a69d7
// So for 6 lines new object as C1 is created
       Car c2= new Car("Audi" , 2003);
    
    }
}