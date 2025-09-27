// Define the Address class
class Address {
    String city;

    // Standard constructor
    Address(String city) {
        this.city = city;
    }

    // Copy constructor for Address
    Address(Address other) {
        this.city = other.city;
    }
}


// Define the Person class
class Person {
    String name;
    Address address; // Contains a reference to an Address object

    // Standard constructor
    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Deep copy constructor for Person
    Person(Person other) {
        this.name = other.name; 
        // Create a completely new Address object, copying the content.
        this.address = new Address(other.address); //its for deep copy (creats a new object for p1 as address, creats another object for p2 as address in heap. so both of the value should be different)
        this.address = other.address; //its for shallow copy
    }
}

// Main class to run the demonstration
public class Deep_Shallow_copy {
    public static void main(String[] args) {
        // 1. Create the original person object.
        Person p1 = new Person("Alice", new Address("NY"));
        
        // 2. Create a deep copy of p1.
        Person p2 = new Person(p1);
        System.out.println(p1);
        System.out.println(p2);
        
        // 3. Modify the city in the copied object (p2).
        // Since p2 has its own separate Address object, this change will ONLY affect p2.
        p2.address.city = "LA";
        
        // 4. Print the city from the original object (p1).
        // The output shows that the original object remains unchanged, as expected.
        System.out.println("p1's city is: " + p1.address.city); // Prints "NY"
        System.out.println("p2's city is: " + p2.address.city); // Prints "LA"
    }
}