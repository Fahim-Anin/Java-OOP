
class Animal {
    // Parent's instance initializer block
    {
        System.out.println("Parent: Instance Initializer Block");
    }
    // Parent's constructor
    public Animal() {
        System.out.println("Parent: Constructor");
    }
}

class Child extends Animal {
    // Child's instance initializer block
    {
        System.out.println("Child: Instance Initializer Block");
    }
    // Child's constructor
    public Child() {
        System.out.println("Child: Constructor");
    }
 public static void main(String[] args) {
        Child myChild = new Child();
    }
}


   
