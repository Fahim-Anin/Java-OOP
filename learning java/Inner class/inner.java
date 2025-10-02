class A{
    public void show(){
        System.out.println("A");
    }


class B{
   public void show()
   {
    System.out.println("B");
   }
}
}
public  class inner{
    public static void main(String[] args) {
        A a1= new A();
        a1.show();
        A.B b1 = a1.new B();
        b1.show(); 
    }
}