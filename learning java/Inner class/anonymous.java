// ---Anonymous inner class --

// class A{
//     public void show(){
//         System.out.println("A");
//     }
// }

// // class B extends A{
// //     public void show(){
// //         System.out.println("b");
// //     }
// // }

// public class anonymous{
//     public static void main(String[] args) {
//         // A obj = new B();
//         // obj.show();

//         A a1= new A()
//         {
//             public void show()
//             {
//                 System.out.println("Anonymous");
//             }
//         };
//         a1.show();
//     }
// }


//anounymous abstract class
abstract  class B{
    public abstract void show();
    public  void config(){
         System.out.println("Anonoymous Config");
    };

}

public class anonymous{
    public static void main(String[] args) {
        B b1 = new B()
        {
            public void show()
            {
                System.out.println("B show");
            }
            public void config()
            {
                System.out.println("B Config");
            }
        };
        b1.show();
        b1.config();
    }
}