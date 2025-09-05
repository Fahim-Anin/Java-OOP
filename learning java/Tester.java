public class Tester {
    public static void main(String[] args) {
        Student s1= new Student(); //creates memory location
        //Student s2= new Student();
        // s1.name = "MARUF";
        // s1.id="444";
        // s2.name = "Fahim";
        // s2.id="84840";
        // System.out.println(s1.name);
        // System.out.println(s1.id);
        // System.out.println(s2.name);
        // System.out.println(s2.id);

        // s1=s2;
        // System.out.println(s1.name);
        // System.out.println(s1.id);
        // System.out.println(s2.name);
        // System.out.println(s2.id);
        
        // s1.name= "JAHID";
        // System.out.println(s1.name);
        // System.out.println(s1.id);
        // System.out.println(s2.name);
        // System.out.println(s2.id);
        s1.name="Fahim";
        s1.id="443";
        
        s1.showdetails("114"); //this showdetails actually inherits the instance method of main class
        
        s1.cgpa = 5; //instance variable
        s1.increasecgpa(7);  //local variable

        //method overloading
        System.out.println(s1.addcgpa(4,5));
        System.out.println(s1.addcgpa("Hello","Fahim"));
    }
    
}

//output
// MARUF
// 444
// Fahim
// 84840

// * S1=s2 / here memory location of s2 is stored in the memory location of s1
// Fahim
// 84840
// Fahim
// 84840

//s1.name= "JAHID";
// aS both memory locations are same so if we change any value of variable this will change for both object
// JAHID
// 84840
// JAHID
// 84840


// //     s1.id="443";
        
//         s1.showdetails("114"); //this showdetails actually inherits the instance method of main class
        
//         s1.cgpa = 5; //instance variable
//         s1.increasecgpa(7);  //local variable
//     }

// Output --->
// // Fahim
// // 114
// // 114
// // 14
// // 5